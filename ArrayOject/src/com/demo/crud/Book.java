package com.demo.crud;

public class Book {
	private int BookId;
	private String Bookname;
	private String AuthorName;
	private int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookname, String authorName, int price) {
		super();
		BookId = bookId;
		Bookname = bookname;
		AuthorName = authorName;
		this.price = price;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", Bookname=" + Bookname + ", AuthorName=" + AuthorName + ", price=" + price
				+ "]";
	}
	
	

}
