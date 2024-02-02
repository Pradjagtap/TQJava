package com.demo.loop;
import java.util.Scanner;

public class Check_prime_test {
	public static void CheckPrime(int n) {
		int i;
		int count=0;
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;
				
			}
		}
		if(count==0) {
			System.out.println(n+" is a prime number");
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
		CheckPrime(n);


	}
}


