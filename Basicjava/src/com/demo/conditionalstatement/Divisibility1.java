package com.demo.conditionalstatement;

import java.util.Scanner;

public class Divisibility1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		if(num%5==0) {
			System.out.println("Hello");
		}
		else if(num%3==0) {
			System.out.println("Welcome");
		}
		else if (num%6==0) {
			System.out.println("good morning");
		}
	}

}
