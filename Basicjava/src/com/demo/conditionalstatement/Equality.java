package com.demo.conditionalstatement;

import java.util.Scanner;
public class Equality {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Enter any number: ");
		num1=sc.nextInt();
		System.out.println("Enter any number: ");
		num2=sc.nextInt();
		System.out.println("Enter any number: ");
		num3=sc.nextInt();
		
		if(num1==num2 && num2==num3) {
			System.out.println("These three numbers are equal");
		}
		else {
			System.out.println("These three numbers are not equal");
			
		}
	}

}
