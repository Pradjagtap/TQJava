package com.demo.loop;

import java.util.Scanner;
public class Series3 {

	public static void series(int n) {
		int i,sum;
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				sum=i+i;//2*i
				System.out.println(sum);
			}
			else {
				sum=-i-i;//-2*i
				System.out.println(sum);
			}
				
			}
	}
	public static void main(String[] args) {
		// Print Series 2 -4 6 -8………n terms
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		series(n);
		

	}

}
