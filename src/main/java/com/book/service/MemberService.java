package com.book.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.book.dto.MemberDTO;
import com.book.mapper.MemberMapper;

@Service
public class MemberService {
	
	private MemberMapper memberMapper;
	
	
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}


	public MemberDTO login(String mId, String mPasswd) {
	    HashMap<String, Object> map = new HashMap<String, Object>();
	    map.put("mId", mId);
	    map.put("mPasswd", mPasswd);
	    return memberMapper.login(map);
	}



}
