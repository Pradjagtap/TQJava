package com.demo.intermediate;

import java.util.Arrays;

public class ShiftNegativePositive {
	// at the end: negative

	static void ShiftNegative(int arr[]) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			while (arr[left] > 0 && left < right)
				left++;
			while (arr[right] < 0 && left < right)
				right++;
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right++;
			}
		}
	}

	static void ShiftNegative2(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				for(int j=arr.length-1;j>=0;j--)
				{
					if(arr[i]<0 && i<j)
					{
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
				
			}
	}

	public static void main(String[] args) {
		int arr[]= {3,4,-1,6,-7,8,-5,2,9};
		System.out.println(Arrays.toString(arr));
		
		ShiftNegative(arr);
		System.out.println(Arrays.toString(arr));
		
		ShiftNegative2(arr);
		System.out.println(Arrays.toString(arr));

	}

}
