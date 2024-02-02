package com.demo.conditionalstatement;
import java.util.Scanner;

public class Example_leap_year {

	public static void main(String[] args) {
		//1. Write a Java program to check whether a year is leap year or not.
		Scanner sc=new Scanner(System.in);
		
		int year;
		
		System.out.println("Enter a year: ");
		year=sc.nextInt();
		
		if((year%100==0 && year%400==0) || year%4==0 ) {
			System.out.println("This year is a leap year");
		}
		else {
			System.out.println("This year is not a leap year");
		}

	}

}
