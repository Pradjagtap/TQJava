package com.demo.practice;

import java.util.Scanner;

public class Alphabet_practice {
	public static void alphabet(int n) {
		char i;
		for(i=97;i<=122;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		alphabet(n);
		
	}

}
