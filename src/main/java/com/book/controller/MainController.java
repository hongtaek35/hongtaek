package com.book.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.book.dto.BookDTO;
import com.book.dto.MemberDTO;
import com.book.service.BookService;
import com.book.service.MemberService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

	@Controller
	public class MainController {
	  private BookService service;
	  private MemberService memberService;

	  public MainController(BookService service, MemberService memberService) {
		  super();
		  this.service = service;
		  this.memberService = memberService;
	  }

	  @RequestMapping("/")
	  public String index() {
	    System.out.println("test");
	    return "index";
	  }


	//아이디비번으로함
	  @PostMapping("/login")
	  public String login(String mId, String mPasswd, HttpSession session) {
	    System.out.println(mId + " " + mPasswd);
	    // 로그인 처리
	    MemberDTO dto = memberService.login(mId, mPasswd);
	    // 로그인 성공
	    session.setAttribute("member", dto);

	    return "redirect:/main";
	  }

	  @RequestMapping("/main")
	  public ModelAndView main(ModelAndView view) {
	    view.addObject("list", service.selectAllBook());
	    view.setViewName("main");
	    return view;
	  }

	  @RequestMapping("/Book/insert")
	  public String insert(BookDTO dto, HttpServletResponse response) throws IOException {
	    System.out.println(dto);
		    try {
		    service.insertBook(dto);
		  } catch (Exception e) {
			  String msg = "<script>alert('데이터 등록에 실패하였습니다');location.href='/main';</script>";
			  response.setContentType("text/html; charset=utf-8");
			  response.getWriter().write(msg);
			  return null;
		  }
	    return "redirect:/main";
	  }

	  @RequestMapping("/book/update/{isbn}")
	  public ModelAndView updatView(@PathVariable String isbn, ModelAndView mv) {
	    mv.addObject("dto", service.selectBookByisbn(isbn));
	    mv.setViewName("book_update");
	    return mv;
	  }

	  @RequestMapping("/book/update")
	  public String update(BookDTO dto) {
	    service.updateBook(dto);
	    return "redirect:/main";
	  }

	  @RequestMapping("/book/delete/{isbn}")
	  public String delete(@PathVariable String isbn) {
	    service.deleteBook(isbn);
	    return "redirect:/main";
	  }

	  @RequestMapping("/book/search")
	  public ResponseEntity<String> search(String kind, String search) {
	    System.out.println(kind + " " + search);
	    List<BookDTO> list = service.searchBook(kind, search);
	    return new ResponseEntity(list, HttpStatus.OK);
	  }

}
