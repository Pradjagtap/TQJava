package com.demo.methoddemo;

import java.util.*;

public class Math_test {
	
	public static int square(int n) {
		return n*n;
					
	}
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		
		int x=square(n);
		System.out.println("Square is "+x);
		
		int y=cube(n);
		System.out.println("Cube of a number is "+y);
		
		
		
		
	}

}
