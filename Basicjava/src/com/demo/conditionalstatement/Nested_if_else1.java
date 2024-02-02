package com.demo.conditionalstatement;

import java.util.Scanner;
public class Nested_if_else1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		/*if(num%5==0) {
			System.out.println(num+" is divisible by 5");
		}
		else if(num%11==0) {
			System.out.println(num+" is divisible by 11");
		}
		else {
			System.out.println(num+" is not divisible by both");
		}*/
		
		/*if(num%5==0 && num%11==0) {
			System.out.println(num+" is divisible by both");
		}
		else if(num%5==0) {
			System.out.println(num+" is divisible by 5");
		}
		else if(num%11==0) {
			System.out.println(num+" is divisible by 11");
		}
		else {
			System.out.println("not by both");
		}*/
		
		if(num%5==0) {
			if(num%11==0) {
				System.out.println(num+" is diviible by 5 and 11");
			}
			else {
				System.out.println(num+" is only divisible by 5");
			}
		}
		else if(num%11==0) {
			
				System.out.println(num+" is divisible by 11 only");
			
		}
		else {
			System.out.println("not by both");
		}
	}



	}


