package com.demo.assignment;
//WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
import java.util.Arrays;
import java.util.Scanner;

//1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
public class Secondmax {
	
	public static void secondmax(int[]arr) {
		int max=arr[0];
		int smax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(smax<max) {
				smax=arr[i];
			}
					
		}
		System.out.println("Max: "+smax);
		
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter length: ");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		
//		System.out.println("Enter elements: ");
//		for(int i=0;i<size;i++) {
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
		secondmax(arr);

	}

}
