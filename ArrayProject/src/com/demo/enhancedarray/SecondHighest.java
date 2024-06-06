package com.demo.enhancedarray;

import java.util.Arrays;

public class SecondHighest {
	static int findsecondHighest(int ar[]) 
	{
		int highest=Integer.MIN_VALUE;//int highest=ar[0]
		int shighest=Integer.MIN_VALUE;//int shighest=ar[0]
		//we cant take int highest =0 beco then it will not consider negative values
		
		for(int x: ar)
		{
			if(x>highest)
			{
				shighest=highest;
				highest=x;
			}
			else if(x>shighest)
			{
				shighest=x;
			}
		}
//		for(int i=0;i<ar.length;i++)
//		{
//			if(ar[i]>highest)
//			{
//				shighest=highest;
//				highest=ar[i];
//				
//			}
//			else if(ar[i]>shighest)
//			{
//				shighest=ar[i];
//			}
//		}
		return shighest;
	}

	public static void main(String[] args) {
		int arr[]= {2,5,3,1,4,6,0};
		System.out.println(Arrays.toString(arr));
		int sh=findsecondHighest(arr);
		System.out.println("Second highest: "+sh);
	}

}
