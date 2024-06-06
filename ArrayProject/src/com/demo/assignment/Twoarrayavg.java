package com.demo.assignment;

import java.util.Scanner;

/*
 6.  Write two methods that return the average of an array with following headers.
a.  public static int average(int[] array)
b.  public static double average(double[] array).
c.  Write main and invoke the 2 methods.
 */
public class Twoarrayavg {
	public static int average1(int[] arr) {
		int sum=0;
		int average=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		average=sum/arr.length;
		return average;
	}
	public static double average2(double[] arr) {
		double sum=0;
		double average=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		average=sum/arr.length;
		return average;
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
			
			double array[]=new double[size];
			System.out.println("Enter elements: ");
			for(int i=0;i<size;i++) {
				array[i]=sc.nextDouble();
			}
			
			System.out.println(average1(arr));
			System.out.println(average2(array));
			

	}

}
