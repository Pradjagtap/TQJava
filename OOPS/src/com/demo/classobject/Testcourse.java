package com.demo.classobject;
import java.util.Scanner;
public class Testcourse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,fees;
		String name;
		System.out.println("Enter courseid: ");
		id=sc.nextInt();
		System.out.println("Enter name of student: ");
		name=sc.next();
		System.out.println("Enter fees: ");
		fees=sc.nextInt();		
		Course c1=new Course();
		c1.setDetails(id,name,fees);
		c1.displayData();
		System.out.println("courseid is "+id+" name of the student is "+name+" and fees of course is "+fees);
		

	}

}
