package com.demo.assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
 3>>Write a program to reverse an array in following manner.
   Suppose array size is even then later half should come first and first half 
   should go last. E.g. input array { 1,2,5,7,3,4} output will be { 7,3,4, 1,2,5}. 
   If array size is even then middle element should remain as it is and array will be
    reversed as above. E.g. input array { 5,22,55,21,4,54,10} 
    output will be {4,54,10,21,5,22,55}
 */
public class Reversehalf {
	public static void reverseArray(int[]arr)
	{
		int[]arr2=new int[arr.length];
		int index=0;
		if(arr.length%2==0) {
			for(int i=arr.length/2;i<arr.length;i++) {
			arr2[index++]=arr[i];
			
		}
		for(int i=0;i<arr.length/2;i++)
		{
			arr2[index++]=arr[i];
		}
		}
		else {
			for(int i=(arr.length/2)+1;i<arr.length;i++)
			{
				arr2[index++]=arr[i];
			}
			arr2[index++]=arr[arr.length/2];
			for(int i=0;i<arr.length/2;i++)
			{
				arr2[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size: ");
//		int[] arr=new int[sc.nextInt()];
//		System.out.println("Enter elements: ");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {1,2,5,7,3,4};
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		
		System.out.println("------");
		int arr1[]= {5,22,55,21,4,54,10};
		System.out.println(Arrays.toString(arr1));
		reverseArray(arr1);
		
		
	}

}
