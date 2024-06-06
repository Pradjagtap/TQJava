package com.demo.assignment;

import java.util.Arrays;

public class SortAsceanddDesc {
	static void sorting(int arr[])
	{
		int ele;
		int index=1;
//		arr[0]=ele;
//		arr[arr.length-1]=ele;
//		arr[(arr.length-1/2)-1]=ele;
		
		for(int i=1;i<arr.length/2;i++) {
			int max=arr[1];
			if(arr[i]>max)
				max=arr[i];
			arr[index++]=arr[i];
		}
		for(int i=arr.length/2+1;i<arr.length-2;i++) {
			int min=arr[1];
			if(arr[i]<min)
				min=arr[i];
			arr[index++]=arr[i];
		}
		
	}
	

	public static void main(String[] args) {
		int arr[]= {1,5,6,7,10,9,3};
		System.out.println(Arrays.toString(arr));
		//o/p arr[]={1,6,5,7,9,10,3};
		sorting(arr);
		System.out.println(Arrays.toString(arr));

	}

}
