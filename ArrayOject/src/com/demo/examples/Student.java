package com.demo.examples;

import com.demo.example4.Department;

public class Student {
	int id;
	String name;
	double marks;
	
	Student(){
		
	}
	Student(int id,String name, double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
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
	

}
