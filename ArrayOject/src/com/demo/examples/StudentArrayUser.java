package com.demo.examples;

import java.util.Scanner;

public class StudentArrayUser {
	
	static Scanner sc= new Scanner(System.in);
	
	static void enterStudentDetails(Student s)
	{
		 System.out.println("Enter student id:");
		  
		  s.setId(sc.nextInt());
		  
		  System.out.println("Enter student name:");
		  s.setName(sc.next());
		  
		  System.out.println("Enter marks");
		  s.setMarks(sc.nextDouble());
		
	}
	
	static void displayAllStudents(Student st[])
	{
		for(Student s:st)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		
		Student stud[]= new Student[3];
		
		for(int i=0;i<stud.length;i++)
		{
		stud[i]= new Student();
		enterStudentDetails(stud[i]);
		}
//		stud[0].setId(101);
//		stud[0].setName("Rushikesh");
//		stud[0].setMarks(98);
//		
//
//		stud[1].setId(102);
//		stud[1].setName("Onkar");
//		stud[1].setMarks(99);
//		
//
//		stud[2].setId(103);
//		stud[2].setName("Shreyash");
//		stud[2].setMarks(90);
		
//		for(int i=0;i<stud.length;i++)
//		{
//		  System.out.println("Enter student id:");
////		  int id=sc.nextInt();
////		  stud[i].setId(id);
//		  
//		  stud[i].setId(sc.nextInt());
//		  
//		  System.out.println("Enter student name:");
//		  stud[i].setName(sc.next());
//		  
//		  System.out.println("Enter marks");
//		  stud[i].setMarks(sc.nextDouble());
// 
//		}
		
		
		
		
		System.out.println("---------------------------------------");
		displayAllStudents(stud);
		
	}
}