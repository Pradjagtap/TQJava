package com.demo.practice;
import java.util.Scanner;
public class Checkprime {
	public static void checkprime(int n) {
		int i,count=0;
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
	
	if(count==0) {
		System.out.println("prime number");
	}
		else
			System.out.println("not prime number");
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n;
		n=sc.nextInt();
		checkprime(n);
		

	}

}
