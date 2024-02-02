package com.demo.methoddemo;
import java.util.Scanner;

//1. Write a Java program print total number of days in a month using switch case 
public class Switch_case {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month,days=0;
		
		System.out.println("Enter Month number: ");
		month=sc.nextInt();
		
		switch(month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println("29 days");
			break;
		case 4:
		case 6:
		case 9: 
		case 11: 
			System.out.println("30 days");
			break;
			default: 
				System.out.println("invalid entry");
				
			
		
	}
	
	}
}

