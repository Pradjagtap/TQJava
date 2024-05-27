package com.demo.classobject;
import java.util.Scanner;
/*
1. create class Student
2. create 2 objects of Student using new keyword
3) Write a program for class and object : (main method inside class)
4) Write a program for class and object : (main outside class)
5) Write a program for class and object : (initialization through reference)
6) Write a program to demonstrate anonymous object
 */

public class Student3 {
	int id=3;
	String name="richa";

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		s1.id=101;
		s1.name="pradnya";
		System.out.println(s1.id);
		System.out.println(s1.name);
		new Student3();//anonymous object
		Student3 s3=new Student3(),s4=new Student3();
		System.out.println(s3.id);
		System.out.println(s3.name);
		int i;
		for(i=1;i<=2;i++) {
			System.out.println("Enter id: ");
			s1.id=sc.nextInt();
			System.out.println("Enter name: ");
			s1.name=sc.next();
			System.out.println("id "+s1.id+"name "+s1.name);
		}
	}

}
