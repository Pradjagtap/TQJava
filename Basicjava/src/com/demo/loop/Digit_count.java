package com.demo.loop;

import java.util.Scanner;

public class Digit_count {
	
	public static void separaeteNumbers(int num) {
		int rem;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.println(rem);
			System.out.println(num);
			
		}
		System.out.println("original number: "+num);
	}
	public static void countDigits(int num) {
		int rem;
		int count=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
				
	}
		System.out.println("count: "+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter any number: ");
		n=sc.nextInt();
		//separaeteNumbers(n);
		countDigits(n);
		
		}

	}

