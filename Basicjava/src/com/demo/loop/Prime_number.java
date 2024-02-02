package com.demo.loop;
import java.util.Scanner;

public class Prime_number {

	public static void primeNumber(int n) {
		int i,count=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				//System.out.println(i);
				count++;
			}
		}
		System.out.println("count: "+count);
		
		if(count==2) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		primeNumber(n);

	}

}
