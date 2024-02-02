package com.demo.conditionalstatement;

import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int choice;
		System.out.println("------Welcome to my Cafe----");
		System.out.println("1.Tea\n2.Coffee\n3.Cold drinks\n");
		System.out.println("Enter choice: ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Tea is Rs 30");
			break;
		case 2:
			System.out.println("Coffee is Rs 100");
			break;
		case 3: 
			System.out.println("Cold drink Rs 50");
			break;
		default:
			System.out.println("invalid choice");
			
		}

	}

}
