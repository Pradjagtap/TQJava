package com.demo.loop;

import java.util.Scanner;
public class Sum_of_even_number {
	//Write a Java program to find sum of all even numbers between 1 to n. 
	public static void sum_of_even(int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
				System.out.println(sum);
			}
		}
	}
	//Write a Java program to find sum of all odd numbers between 1 to n.
	
	public static void sum_of_odd(int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				sum=sum+i;
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		sum_of_even(n);
		sum_of_odd(n);
		

	}

}
