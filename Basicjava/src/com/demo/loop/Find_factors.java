package com.demo.loop;

import java.util.Scanner;
public class Find_factors {
	public static void factors(int n) {
		int i;
		int count=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			 
				
			}
			
			}
	
		System.out.println("count: "+count);
		
	   
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anny number: ");
		n=sc.nextInt();
		factors(n);
		
		

	}

}
;