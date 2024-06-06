package com.demo.intermediate;

import java.util.Arrays;

//3>>Shift all the even number at the end of array w/o using temporary array
public class Swapeven {
	static void shifteven(int ar[])
	{
		int count=0;
		int i=0;
		if(ar[i]%2==0) {
			
		for(i=0;i<ar.length-1;i++)
		{
			
				ar[count]=ar[i];
				count++;
			
		}
		}
		while(count<ar.length) {
			ar[i]=ar[i];
		}
		System.out.println(Arrays.toString(ar));	
		}
		
				
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println("before sorting: ");
		System.out.println(Arrays.toString(arr));
		
		shifteven(arr);
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(arr));


	}

}
