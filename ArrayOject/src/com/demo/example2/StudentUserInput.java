package com.demo.example2;

import java.util.Scanner;

public class StudentUserInput {
		
		static Scanner sc= new Scanner(System.in);
		
		static void enterStudentDetails(Student s)
		{
			System.out.println("Enter student id:");
			s.setId(sc.nextInt());
			
			System.out.println("Enter student name:");
			s.setName(sc.next());
			
			System.out.println("Enter marks of 3 subjects:");
			double m[]= new double[3];
			for(int i=0;i<m.length;i++)
			{
				System.out.println("Subject "+(i+1)+":");
				m[i]= sc.nextDouble();
			}
			s.setMarks(m);
			
//			Course c= new Course();
//			
//			System.out.println("Enter course id:");
//			c.setCid(sc.nextInt());
//			
//			System.out.println("Enter course name:");
//			c.setCname(sc.next());
//			
//			s.setCourse(c);
			
			s.setCourse(new Course());
			System.out.println("Enter course id:");
			s.getCourse().setCid(sc.nextInt());
			
			System.out.println("Enter course name:");
			s.getCourse().setCname(sc.next());
			
		}

		static void displayDetails(Student st[])
		{
			System.out.println("---------------------------------------");
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
			
			displayDetails(stud);
			

		}

	}
