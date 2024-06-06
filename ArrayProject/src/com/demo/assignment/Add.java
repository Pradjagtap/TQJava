package com.demo.assignment;

import java.util.Arrays;

//WAP to add elements to single dimensional int array and print elements from 1D array
public class Add {
	
	public static void addarray(int []arr,int []arr1) {
		
		int sum1[]=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			//sum=arr[i]+arr1[i];
			sum1[i]=arr[i]+arr1[i];
		}
		System.out.println(" "+Arrays.toString(sum1));
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]= {5,6,7,8,9};
		
		addarray(arr,arr1);
		

	}

}
