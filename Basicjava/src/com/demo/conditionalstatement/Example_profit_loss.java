package com.demo.conditionalstatement;

import java.util.Scanner;
public class Example_profit_loss {

	public static void main(String[] args) {
		// Write a Java program to calculate profit or loss.
		Scanner sc=new Scanner(System.in);
		int sp,cp,profit;
		System.out.println("Enter Selling price: ");
		sp=sc.nextInt();
		System.out.println("Enter cost price: ");
		cp=sc.nextInt();
		
		profit=sp-cp;
		
		System.out.println("Profit in purchase of item is "+profit);
		
	}

}
