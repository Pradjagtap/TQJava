package com.demo.practice;

import java.util.Scanner;
public class Practice2 {

	public static void series(int n) {
		int i,num;
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				num=2*i;
				System.out.println(num);
			}
			else {
				num=-2*i;
				System.out.println(num);
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
