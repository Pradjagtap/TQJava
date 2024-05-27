package com.demo.inheritance;

import java.util.Scanner;

class Student1 {
	protected int id;
	protected String name;
	
	public Student1() {
		
	}
	public Student1(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Id: "+id+"Name: "+name;
	}
	
}
class SchoolStudent extends Student1{
	protected String std;
	protected double fees;
	public SchoolStudent() {
		
	}
	public SchoolStudent(int id, String name,String std,double fees) {
		super(id,name);
		this.std=std;
		this.fees=fees;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String toString() {
		return "SchoolStudent: "+getId()+"Name of student: "+getName()+"Course is "+std+"Fees are "+fees;
	}
}
class CollegeStudent extends Student1
{
	protected double marks;
	protected String grades;
	
	public CollegeStudent() {
		
	}
	public CollegeStudent(int id, String name,double marks,String grades) {
		super(id,name);
		this.marks=marks;
		this.grades=grades;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public String toString(){
		return "College student: "+id+" "+name+" "+marks+" "+grades;
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		SchoolStudent ss1=new SchoolStudent();
		System.out.println(ss1);
//		SchoolStudent ss2=new SchoolStudent(12,"Ruchi","Tenth",5000);
//		System.out.println(ss1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Student id: ");
		ss1.setId(sc.nextInt());
		System.out.println("Student name: ");
		ss1.setName(sc.next());
		System.out.println("Student std: ");
		ss1.setStd(sc.next());
		System.out.println("Student fees: ");
		ss1.setFees(sc.nextDouble());
		
		CollegeStudent c1=new CollegeStudent();
		System.out.println("College Student id: ");
		c1.setId(sc.nextInt());
		System.out.println("College Student name: ");
		c1.setName(sc.next());
		System.out.println("College Student marks: ");
		c1.setMarks(sc.nextDouble());
		System.out.println("College Student Grade: ");
		c1.setGrades(sc.next());
		
		
		
		
//remaining take a scanner and take user input
		//solve other remaining task
	}

}
