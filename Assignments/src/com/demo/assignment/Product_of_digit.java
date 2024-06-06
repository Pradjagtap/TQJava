package com.demo.assignment;

import java.util.Scanner;

public class Product_of_digit {
	//4.WAP to show the use of break statement ( in for loop)
	//9. Write a Java program to calculate product of digits of any number.
	public static void product_of_digit(int n) {
		int product=1;
		
		while(n>0) {
			int digit=n%10;
			product=product*digit;
			n=n/10;
			
		}
		System.out.println("Product of digits of the number.."+n+" is "+product);
		
	}
		
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		product_of_digit(n);
		//gives output n=0 but gives correct output.
}
}