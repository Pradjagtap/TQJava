package com.demo.containment;

public class Author {
	private int id;
	private String name;
	
	public Author() {
		
	}
	public Author(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString() {
		return "Id of author is: "+id+"Name of author: "+name;
	}
}
