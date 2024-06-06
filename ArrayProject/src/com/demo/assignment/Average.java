package com.demo.assignment;

import java.util.Scanner;

public class Average {
	public static void averagearray(int []arr) {
		int sum=0;
		double average=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			average=sum/arr.length;
		}
		System.out.println("Average: "+average);
	}

	
	public static void main(String[] args) {
		//int arr[]= {2,2,2,2,2};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		averagearray(arr);

	}

}
