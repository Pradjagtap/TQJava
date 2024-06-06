package com.demo.assignment;
import java.util.Scanner;
public class Prime_number {
	//11.	Find all prime number between 400 to 300;

	public static void primeNumber() {
		int i;
		for(i=300;i<=400;i++) {
		//int i=300,count=0;
		
		//while(i<=400) {
			int count=0;
			for(int j=2;j<i;j++)
			if(i%j==0) {
				//System.out.println(i);
				count++;
			}
		
		//System.out.println("count: "+count);
		
		if(count==0) {
			System.out.println(i+" is prime number");
		}
		
	}
	}
	public static void main(String[] args) {
				
		primeNumber();
	}
}
