package com.demo.assignment;
import java.util.Scanner;

public class Armstrong_number {
	//check no is Armstrong or not
   // 153=1^3+5^3+3^3=153


	public static void Armstrong(int num) {
		int temp=num;
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
			sum=sum+rem*rem*rem;
			
			num=num/10;
		}
		if(temp==sum) {
			
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("It is not a armstrong number");
	}
	}
	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		Armstrong(num);
	}

}
