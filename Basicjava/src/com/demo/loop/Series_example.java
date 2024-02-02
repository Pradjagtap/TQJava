package com.demo.loop;

import java.util.Scanner;
public class Series_example {
	
	public static void series10(int n) {
		
	int i;
	for(i=10;i<=n;) {
		System.out.println(i);
	i=i+10;
	
		
	}
	System.out.println(i);
	}
			
	
		public static void main(String[] args) {
		// 1.	Write a program in Java to display the first 10 terms of the following series:
		//10, 20, 30, 40, ……..
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		series10(n);
		//series1(n);


	}

}
