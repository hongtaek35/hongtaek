package com.book.dto;

import org.apache.ibatis.type.Alias;

@Alias("member")
public class MemberDTO {
    private String mId;
    private String mPasswd;
    private String mName;
    private String mTel;
    private String mLisence;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPasswd() {
		return mPasswd;
	}
	public void setmPasswd(String mPasswd) {
		this.mPasswd = mPasswd;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmTel() {
		return mTel;
	}
	public void setmTel(String mTel) {
		this.mTel = mTel;
	}
	public String getmLisence() {
		return mLisence;
	}
	public void setmLisence(String mLisence) {
		this.mLisence = mLisence;
	}
	
	
}
