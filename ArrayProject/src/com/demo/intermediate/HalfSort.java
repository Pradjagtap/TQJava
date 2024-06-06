package com.demo.intermediate;

import java.util.Arrays;

//1>> WAP to half sort the array in ascending and half in descending
public class HalfSort {
	static void halfsort(int ar[]) {
		for(int i=0;i<ar.length/2;i++)
		{
			for(int j=i+1;j<ar.length/2;j++)
			{
				if(ar[j]<ar[i])
				{
					//ascending
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=ar.length/2;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]>ar[i])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,5,3,1,4,6,0};
		System.out.println("before sorting: ");
		System.out.println(Arrays.toString(arr));
		
		halfsort(arr);
		
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(arr));


	}

}
