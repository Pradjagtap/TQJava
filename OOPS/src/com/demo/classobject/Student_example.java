package com.demo.classobject;
class student1{
	int studentid;
	String studentname;
	int studentpercent;
	
	public void setDetails() {
		 studentid=1;
		 studentname="richa";
		 studentpercent=86;
		
	}
	public void showDetails() {
		System.out.println("Student id is "+studentid);
		System.out.println("Student name is "+studentname);
		System.out.println("Percentage of student is "+studentpercent);
		
	}
	
}

public class Student_example {

	public static void main(String[] args) {
		student1 s1=new student1();
		s1.setDetails();
		s1.showDetails();
		

	}

}

