package com.demo.loop;

import java.util.Scanner;

public class While_sum_of_natural {
	
	public static void sum(int n) {
		int i=1,sum=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		sum(n);


	}

}
