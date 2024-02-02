package com.demo.operators;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int price=10;
		System.out.println("Enter quantity: ");
		int qty=sc.nextInt();
		
		int totalprice=10*qty;
		System.out.println("Total price of the product is Rs "+totalprice);
		
		

	}

}
