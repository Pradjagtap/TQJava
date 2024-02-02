package com.demo.loop;
import java.util.Scanner;

public class Series1 {
	public static void series1(int n) {
		//2.	Write the program in Java to display the first ten terms of the following series:
		//1, 4, 9, 16,...
		int i,square;
		for(i=1;i<=n;i++) {
			
		square=i*i;
		System.out.println(square);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		series1(n);
	}

}
