package com.demo.loop;

import java.util.Scanner;
public class Power {

	public static void power(int base,int index) {
		int i,power=1;
		for(i=1;i<=index;i++) {
			power=power*base;
			
		}
		System.out.println("Power is: "+power);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int base,index;
		System.out.println("Enter any base: ");
		base=sc.nextInt();
		System.out.println("Enter any index: ");
		index=sc.nextInt();
		power(base,index);
		

	}

}
