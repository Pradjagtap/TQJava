package com.demo.interfaceDemo;

interface Student
{
	void show();
	default void display() {
		System.out.println("I am student");
	}
}

interface Teacher{
	void show();
	default void display() {
		System.out.println("I am a teacher");
	}
}

public class DiamondProblem implements Student,Teacher {


	@Override
	public void show() {
		System.out.println("School name: Heriatge school");
	}
//compulsory override default method causing ambiguity
	public void display() {
		System.out.println("I am in school");
		Student.super.display();
		Teacher.super.display();
	}
	
	public static void main(String[]args) {
		
		Student s;
		s=new DiamondProblem();
		s.show();
		s.display();
		
		Teacher t;
		t=new DiamondProblem();
		t.show();
		t.display();
	}
}
