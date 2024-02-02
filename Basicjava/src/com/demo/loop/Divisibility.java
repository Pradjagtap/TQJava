package com.demo.loop;

import java.util.Scanner;
public class Divisibility {
	
	public static void divisibility(int n) {
		int i;
		for(i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		divisibility(n);

	}

}
