package com.demo.intermediate;

import java.util.Arrays;

//6> Shift zeros at the beginning of array
public class ShiftzeroBegin {
	static void shiftZeros(int ar[]) {
		int count=ar.length-1;
		for(int i=count;i>0;i--)
		{
			if(ar[i]!=0)
			{
				ar[count]=ar[i];
				count--;
			}
		}
		while(count>=0)
		{
			ar[count--]=0;
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,6,1,-7,5,0,4,0,5,6,2};
		
		shiftZeros(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
