package com.book.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.book.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	MemberDTO login(HashMap<String, Object> map);
	

}
