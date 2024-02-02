package com.demo.conditionalstatement;

import java.util.Scanner;
public class Example_positive_or_negative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println(num+" is positive");
		}
		else if(num==0) {
			System.out.println("Number is zero");
		}
			
		else {
			System.out.println(num+" is negative");
		}
		

	}

}
