package com.book.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.book.dto.BookDTO;
import com.book.dto.MemberDTO;

@Mapper
public interface BookMapper {


	List<BookDTO> selectAllBook();

	int insertBook(BookDTO dto);

	Object selectBookByisbn(String isbn);

	int updateBook(BookDTO dto);

	int deleteBook(String bno);

	List<BookDTO> searchBook(HashMap<String, Object> map);

	List<BookDTO> selectLowBook();


}
