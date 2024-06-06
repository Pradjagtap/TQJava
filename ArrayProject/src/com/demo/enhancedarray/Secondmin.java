package com.demo.enhancedarray;

import java.util.Arrays;

//3>> Find the second minimum number in an array without sorting
public class Secondmin {

static int findsecondminimum(int ar[]) 
		{
			int mini=Integer.MAX_VALUE;//int highest=ar[0]
			int smini=Integer.MAX_VALUE;//int shighest=ar[0]
			//we cant take int highest =0 beco then it will not consider negative values
			
			for(int x: ar)
			{
				if(x<mini)
				{
					smini=mini;
					mini=x;
					
				}
				else if(mini>smini)
				{
					smini=x;
				}
			}
			return smini;
			
//			for(int i=0;i<ar.length;i++)
//				{
//					if(ar[i]<mini)
//					{
//						smini=mini;
//						mini=ar[i];
//						
//					}
//					else if(ar[i]>smini)
//					{
//						smini=ar[i];
//					}
//				}
//				return smini;
//			
			
			
		}
	public static void main(String[] args) {
		int arr[]= {22,55,34,15,24,16,10};
		System.out.println(Arrays.toString(arr));
		int sh=findsecondminimum(arr);
		System.out.println("Second minimum: "+sh);

	}

}
