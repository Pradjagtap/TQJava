package com.demo.methoddemo;

import java.util.*;
public class switch_case_methodapproach {
	
	public static void days(int month) {
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
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.println("Enter month number: ");
		month=sc.nextInt();
		
		days(month);

	}

}
