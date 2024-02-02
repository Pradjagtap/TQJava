package com.demo.loop;
import java.util.Scanner;

public class Palimdrome_number {
	public static void check_palimdrome(int num) {
		
		int temp=num,rem,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("Palimdrome number");
		}
		else {
			System.out.println("Not palimdrome number");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,num=0;
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		check_palimdrome(num);
		

	}

}
