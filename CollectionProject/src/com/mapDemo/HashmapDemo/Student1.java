package com.mapDemo.HashmapDemo;

public class Student1 {
	private int id;
	private String name;
	private double marks;
	private String cname;
	public Student1(int id, String name, double marks, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.cname = cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + ", cname=" + cname + "]";
	}
	
	
}
