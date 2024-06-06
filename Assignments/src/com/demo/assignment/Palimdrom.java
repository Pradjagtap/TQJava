package com.demo.assignment;

import java.util.Scanner;

public class Palimdrom {
	//18.	check no is palindrom or not
	
	public static void checkPalindrome(int num) {
		
			int temp=num;
			int sum=0;
			int rem;
					
			while(num>0) {
				rem=num%10;
				sum=sum*10+rem;
				
				num=num/10;
			}
			if(temp==sum) {
				
				System.out.println("It is palindrome number");
			}
			else {
				System.out.println("It is not a palindrome number");
		}
		}
	

	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		checkPalindrome(num);

	}

}
