package com.book.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.book.dto.BookDTO;
import com.book.dto.MemberDTO;
import com.book.mapper.BookMapper;

@Service
public class BookService {
	private BookMapper mapper;

	public BookService(BookMapper mapper) {
	    this.mapper = mapper;
	  }



	public List<BookDTO> selectAllBook() {
		return mapper.selectAllBook();
	}


	public int insertBook(BookDTO dto) {
		return mapper.insertBook(dto);
	}

	public Object selectBookByisbn(String isbn) {
		return mapper.selectBookByisbn(isbn);
	}

	public int updateBook(BookDTO dto) {
		return mapper.updateBook(dto);
	}

	public int deleteBook(String bno) {
		return mapper.deleteBook(bno);
	}

	public List<BookDTO> searchBook(String kind, String txt) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("kind", kind);
		map.put("txt", txt);
		return mapper.searchBook(map);
	}

	public List<BookDTO> selectLowBook() {
		return mapper.selectLowBook();
	}

}
