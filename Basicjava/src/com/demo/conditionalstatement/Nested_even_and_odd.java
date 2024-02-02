package com.demo.conditionalstatement;

import java.util.Scanner;
public class Nested_even_and_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter number:");
		num=sc.nextInt();
		//14
		if(num%2==0) {
			//divisible by 6
			System.out.println(num+" is even");
			if(num%6==0) {
				System.out.println(num+" is divisible by 6 ");
			}
			else {
				System.out.println(num+" is not divisible by 6 ");
			}
		}
		else {
			System.out.println(num+" is odd");
			if(num%5==0) {
				System.out.println(num+" is divisible by 5");
			}
			else {
				System.out.println(num+" is not divisible by 5");
			}
		}
	}

}
