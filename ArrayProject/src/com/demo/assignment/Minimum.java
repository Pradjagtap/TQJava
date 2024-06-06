package com.demo.assignment;

import java.util.Scanner;

//Find the maximum number in an array
public class Minimum {
	public static int min(int[]arr) {
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				
			min=arr[i];
			}
	}
		return min;
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
		System.out.println("Element from user: ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Min number: "+min(arr));
		
	}

}


