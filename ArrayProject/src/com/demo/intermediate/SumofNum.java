package com.demo.intermediate;

import java.util.Arrays;

public class SumofNum {
	static void  Numsum(int arr[]) {
		int sum=8;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("Sum"+arr[i]+"+"+arr[j]);
					
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {2,3,5,6,0,8};
		System.out.println(Arrays.toString(arr));
		
		Numsum(arr);

	}

}
//if we want pair like (2,6)&(6,2)both then take j=0