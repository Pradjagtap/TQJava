package com.demo.assignment;

import java.util.Scanner;

public class Frequency_of_digit {
//10. Write a Java program to find frequency of each digit in a given integer.
	
	public static void frequency(int n) {
		int i;
		i=0;
		int count=0;
		for(i=0;i<=9;i++) {
			count=0;
			
			int temp=n;
			int rem=0;
			while(temp>0) {
				 rem=temp%10;
				if(rem==i) {
					count++;
				}
				temp=temp/10;
			}
		
			//System.out.println(i+"------->"+count);
			if(count>0) {
				System.out.println(i+"\t"+count);
			}
	
				
				}
				}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		System.out.println("Digit\tFrequency");
		frequency(n);

	}

}
