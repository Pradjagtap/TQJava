package com.demo.loop;

import java.util.Scanner;

public class Sum {
	
	public static void sum(int n1, int n2) {
		int i,n=0,sum;
		for(i=1;i<=n;i++) {
			sum=n1+n2;
			System.out.println(sum);		
			
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n;
		System.out.println("Enter n1: ");
		n1=sc.nextInt();
		System.out.println("Enter n2: ");
		n2=sc.nextInt();
		sum(n1, n2);

	}

}
