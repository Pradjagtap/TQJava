package com.demo.assignment;

import java.util.Scanner;

public class Armstrong_number_general {

	public static int countDigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public static int power(int base, int pow) {
		int i;
		int p=1;
		for(i=1;i<=pow;i++) {
			p=p*base; 
		}
		return p;
	}
	public static boolean testArmstrong(int num) {
		int pow=countDigit(num);
		int original=num;
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+power(rem,pow);//sum=sum+rem*rem*rem; //sum=sum+Math.pow(rem,pow)
			num=num/10;
		}
		return original==sum;
	}
	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		boolean status=testArmstrong(num);
		if(status)
			System.out.println("Armstrong");
		else
			System.out.println("no armstrong");
		// TODO Auto-generated method stub

	}

}
