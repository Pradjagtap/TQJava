package com.demo.assignment;

import java.util.Scanner;

public class Maxmin {
	public static void maxmin(int arr[]) {
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			else if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[]= {1,2,3,4,5,6};
		maxmin(arr);

	}

}
