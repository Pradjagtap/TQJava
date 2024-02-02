package com.demo.methoddemo;

import java.util.*;
//WAP to create method display with parameter String and take name of user

public class Methodtest1 {

		public static void display(String name) {
			System.out.println("Name: "+name);
		}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter name: ");
		name=sc.next();
		display(name);
		

	}

}
