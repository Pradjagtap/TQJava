package com.demo.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Copy {
	public static void copyarray(int []arr){
		int copy[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copy[i]=arr[i];
		}
		System.out.println("Copy: "+Arrays.toString(copy));
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

		System.out.println("Original: "+Arrays.toString(arr));
		copyarray(arr);

}
}
