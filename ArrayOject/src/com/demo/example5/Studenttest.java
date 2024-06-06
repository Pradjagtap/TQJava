package com.demo.example5;

import java.util.Scanner;

public class Studenttest {
	static Scanner sc = new Scanner(System.in);

	static void enterStudentDetails(Student1 s) {
		System.out.println("Enter student id: ");
		s.setSid(sc.nextInt());
		System.out.println("Enter student name: ");
		s.setName(sc.next());
		System.out.println("Enter marks of 5 subjects:");
		double m[]= new double[5];
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Subject "+(i+1)+":");
			m[i]= sc.nextDouble();
		}
		s.setMarks(m);
			
		
	}
	
	static void percentage(Student1 s[])
	{
		double percent,total;
		int sub1 = 0,sub2 = 0,sub3 = 0,sub4 = 0,sub5 = 0;
		
		total=sub1+sub2+sub3+sub4+sub5;
		percent=(total*100)/500;
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+percent);
	}
	static void displayDetails(Student1 s[])
	{
		System.out.println("---------------------------------------");
		for(Student1 s1:s)
		{
			System.out.println(s1);
		}
	}
	

	public static void main(String[] args) {
		Student1 stud[]= new Student1[2];
		
		for(int i=0;i<stud.length;i++)
		{
			stud[i]= new Student1();
			enterStudentDetails(stud[i]);
		}
		displayDetails(stud);
		percentage(stud);
	
	}
	

}
