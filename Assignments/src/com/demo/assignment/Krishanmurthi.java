package com.demo.assignment;

import java.util.Scanner;

//check no is krishnamurthi or not
//153=1!+5!+3!=153

public class Krishanmurthi {
	public static void krishanmurthiNumber(int num) {
	int temp,sum=0,rem;
	temp=num;
	while(num>0) {
		int fact=1;
		rem=num%10;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	System.out.println(sum);
	if(sum==temp) {
		System.out.println("Krisanmurthi number");
	}
	else {
		System.out.println("Not krishanmurthi number");
		
	}
	}

		
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		krishanmurthiNumber(num);
		

	}

}
