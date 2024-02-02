package com.demo.loop;

import java.util.Scanner;
public class Sum_of_natural_number {
	public static void sum(int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+i;
			
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		sum(n);
	}

}
