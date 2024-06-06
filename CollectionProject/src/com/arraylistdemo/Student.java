package com.arraylistdemo;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public int compareTo(Student s) {
		
//		if(this.id==s.id)
//		return 0;
//		else if(this.id>s.id)//decreasing order
//			return -1;
//		else
//			return 1;
		
		//********************
//		if(this.marks==s.marks)
//			return 0;
//			else if(this.marks>s.marks)//decreasing order
//				return -1;
//			else
//				return 1;
		
		//*******************
		
	//	return this.name.compareTo(s.name);
		
		//*******************
		
		if(this.marks==s.marks)
			return this.name.compareTo(s.name);
			else if(this.marks>s.marks)//decreasing order
				return -1;
			else
				return 1;
		
		
		}
}


	


