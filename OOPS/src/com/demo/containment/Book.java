package com.demo.containment;

public class Book {
	private int bid;
	private String bname;
	private Author author;

	public Book(){
		
	}
	public Book(int bid,String bname,Author author) {
		this.bid=bid;
		this.bname=bname;
		this.author=author;
	}
	public void setBid(int bid) {
		this.bid=bid;
	}
	public int getBid() {
		return bid;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public String getBname()
	{
		return bname;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public Author getAuthor() {
		return author;
	}
	public String toString() {
		return "Id of book is: "+bid+"Name of book: "+bname+"Name of author is "+author;
	}
	
}
