package com.demo.intermediate;

import java.util.Arrays;

public class Sorting {
	
	static void sortArray(int ar[]){
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[i])
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
		
		sortArray(arr);
		
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(arr));


	}

}
