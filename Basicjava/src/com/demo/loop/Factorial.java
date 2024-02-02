package com.demo.loop;

import java.util.Scanner;
public class Factorial {

	public static void factorial(int n) {
		int i,sum=1;
		for(i=1;i<=n;i++) {
			sum=sum*i;
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		factorial(n);

	}

}
