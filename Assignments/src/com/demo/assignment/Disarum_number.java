package com.demo.assignment;
import java.util.Scanner;

public class Disarum_number {
	//Disarum no 135=1+3*3+5*5*5=135
	public static void disrumNumber(int num) {
		
		int digits=0,n=0;
		int sum=0;
		while(num>0) {
			digits++;
			num=num/10;
		}
		num=n;
		
		while(num>0) {
			int rem=num%10;
			sum=sum+(int)Math.pow(rem, digits);
			
			num=num/10;
			digits--;
		}
		if(n==sum) {
			
			System.out.println("It is Disarum number");
		}
		else {
			System.out.println("It is not a Disarum number");
	}
	}
	

	public static void main(String[] args) {
		int num,n=0;
		num=n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		disrumNumber(num);

	}

}
