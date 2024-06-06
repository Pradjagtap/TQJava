package com.demo.intermediate;

import java.util.Arrays;

//Shift all the even number at the end of array using temporary array 
public class Swapevenend {
	
	static void shifteven(int ar[])
	{
		for(int i=0;i<ar.length;i++) {
			for(int j=ar.length-1;j>=0;j--) {
				if(ar[i]%2==0 && i<j) {
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
	
	}
	public static void main(String[] args) {
		int arr[]= {2,5,3,1,4,6,9};
		System.out.println("before sorting: ");
		System.out.println(Arrays.toString(arr));
		
		shifteven(arr);
		
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(arr));


	}

}
