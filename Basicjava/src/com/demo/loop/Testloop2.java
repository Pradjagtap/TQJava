package com.demo.loop;

import java.util.Scanner;
public class Testloop2 {
	
	public static void printloop(int range) {
		int i;
		for(i=1;i<=range;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n=sc.nextInt();
		printloop(n);

	}

}
