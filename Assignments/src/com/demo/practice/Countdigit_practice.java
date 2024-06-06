package com.demo.practice;
import java.util.*;
public class Countdigit_practice {
	/*public static void countdigit(int num) {
		int rem,count=0;
		
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.println(rem);
		    System.out.println(num);		
		}
		System.out.println("onum: "+num);
	}*/
	public static void countdigit1(int num) {
		int rem,count=0;
		
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
			
		}
		System.out.println("count: "+count);
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		//countdigit(n);
		countdigit1(n);
		

	}

}
