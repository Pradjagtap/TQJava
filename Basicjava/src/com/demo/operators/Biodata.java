package com.demo.operators;

import java.util.Scanner;
public class Biodata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("My name is "+name);
		System.out.println("Email: ");
		String email=sc.next();
		System.out.println("Email id is: "+email);
		System.out.println("Enter age ");
		int age=sc.nextInt();
		System.out.println("My age is "+age+"yrs");
		System.out.println("Enter height: ");
		double height=sc.nextDouble();
		System.out.println("My height is "+height+"feet");
		System.out.println("Enter weight: ");
		double weight=sc.nextDouble();
		System.out.println("My weight is "+weight+"kg");
		System.out.println("Enter Quali: ");
		String Qual=sc.next();
		System.out.println("My qualification is "+Qual);
		System.out.println("Enter known language: ");
		Boolean lang=sc.nextBoolean();
		System.out.println("Language known: ");
		
		
		

	}

}
