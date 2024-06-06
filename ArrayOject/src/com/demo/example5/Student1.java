package com.demo.example5;

import java.util.Arrays;

/*
 * 
Create a class Student having id,name, array of marks
and percentage
Create a method to calculate percentage
from the marks
Create 5 object of this class anonymously.
Display the student details containing id,name and percentage
 */
public class Student1 {
	private int sid;
	private String name;
	private double[]marks;
	private double percent;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int sid, String name, double[] marks, double percent) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.percent = percent;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", percent=" + percent
				+ "]";
	}
	

}
