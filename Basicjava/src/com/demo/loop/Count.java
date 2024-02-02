package com.demo.loop;

import java.util.Scanner;
public class Count {
	public static void printloop(int start,int end) {
		int i;
		int count=0;
		for(i=start;i<=end;i++) {
			System.out.println(i);
			count++;
		}
		System.out.println("count: "+count);
			
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter start number: ");
		start=sc.nextInt();
		System.out.println("Enter end number: ");
		end=sc.nextInt();
		printloop(start,end);
	}

}
