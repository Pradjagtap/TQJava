package com.demo.loop;

import java.util.Scanner;

public class While_loop {
	public static void printNo(int n) {
		int i=1;
		
		while(i<=n) {
			System.out.println(i);
			i++;
			
		}
	}
	

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		printNo(n);

	}

}
