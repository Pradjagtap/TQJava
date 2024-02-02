package com.demo.loop;

import java.util.Scanner;
public class Alphabet {
	//5.Write a Java program to print all alphabets from a to z. - using  for loop

	public static void alphabet(int n) {
		char i;
		for(i=97;i<=122;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter any number: ");
		n=sc.nextInt();
		alphabet(n);
		

	}

}
