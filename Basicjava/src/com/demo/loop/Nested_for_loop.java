package com.demo.loop;
import java.util.Scanner;
public class Nested_for_loop {
	public static void printFact(int n) {
		int i,j,fact;
		
		for(i=1;i<=n;i++) {
			fact=1;
			for(j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println(i+"!="+fact);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		printFact(n);
		
		

	}

}
