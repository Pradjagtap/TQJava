package com.demo.assignment;

import java.util.Scanner;

public class Twin_prime {
		
	public static int prime1() {
		int i,n=0;
		for(i=2;i<=n;) {
			//for(j=2;j<=i;j++) {
				
			if(i%n==0) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not prime number");
			}
			
			}
		return n;
	}
		
		
		public static int prime2() {
			int i,m=0;
			for(i=2;i<=m;i++) {
				
				//for(j=2;j<=i;j++) {
					
				if(i%m==0) {
					System.out.println("Prime Number");
				}
				else {
					System.out.println("Not prime number");
				}
				}
			return m;
			
			
		
	
}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		System.out.println("Enter any number: ");
		m=sc.nextInt();
		prime1();
		//prime2();
		

	}

}
