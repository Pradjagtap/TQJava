package com.demo.classobject;
//state-what object have-variable
//rollno name
//behavior -what object does-method
//displayInfo()
public class Student {
	//instance variable -inside class and outside method
	int rollno=101;
	String name="pooja";
	
	public void setDetails() {
		rollno=103;
		name="reena";
		}
	
	public void displayInfo() {
		System.out.println("Roll no: "+rollno);
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		
		s1.displayInfo();
		s2.displayInfo();
		s3.setDetails();
		s3.displayInfo();
		
	}

}
