package com.book.dto;

import org.apache.ibatis.type.Alias;

@Alias("book")
public class BookDTO {
	private String isbn;
	private String bTitle;
	private String bWriter;
	private String bPublisher;
	private int bMoney;
	private int bSellCount;
	public BookDTO(String isbn, String bTitle, String bWriter, String bPublisher, int bMoney, int bSellCount) {
		super();
		this.isbn = isbn;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bPublisher = bPublisher;
		this.bMoney = bMoney;
		this.bSellCount = bSellCount;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbPublisher() {
		return bPublisher;
	}
	public void setbPublisher(String bPublisher) {
		this.bPublisher = bPublisher;
	}
	public int getbMoney() {
		return bMoney;
	}
	public void setbMoney(int bMoney) {
		this.bMoney = bMoney;
	}
	public int getbSellCount() {
		return bSellCount;
	}
	public void setbSellCount(int bSellCount) {
		this.bSellCount = bSellCount;
	}

	
}
