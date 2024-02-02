package com.demo.loop;

import java.util.Scanner;

public class Even {
	//Q. WAP to print even numbers from 121 to 229 using for loop. 
	//Q. WAP to print odd numbers from 521 to 229 using while loop. 
	
	public static void even(int n) {
		int i;
		for(i=121;i<=229;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
		}
	}
	//Q. WAP to print odd numbers from 521 to 229 using while loop. 
	public static void odd(int n) {
		int i;
		for(i=229;i<=521;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	    
	
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		i=sc.nextInt();
		even(i);
		odd(i);
	}
}
		
	
	
