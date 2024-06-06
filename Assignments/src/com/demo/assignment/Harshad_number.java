package com.demo.assignment;

import java.util.Scanner;
public class Harshad_number {
	public static void harshadNumber(int num) {
		int temp,count=0,rem;
		int power=1;
		temp=num;
		int sum=0,num1;
	

	while(temp!=0) {
		rem=temp%10;
		sum=sum+rem;
		temp=temp/10;
		count++;
	}
	//System.out.println("sum: "+sum);
	num1=num%sum;
	//System.out.println("Number: "+num1);
		
	if(num1==0) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}
	
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		harshadNumber(num);
	}

}
