package com.demo.example2;

import java.util.Arrays;

public class Student {
	
	private int id;
	private String name;
	private double [] marks;
	private Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double[] marks, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
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
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] d) {
		this.marks = d;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", course=" + course
				+ "]";
	}
	
	
	
	

}