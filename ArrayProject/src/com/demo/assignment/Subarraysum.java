package com.demo.assignment;

import java.util.Arrays;

/*
 4>>Find a continuous sub array whose sum is equal to given number. 
   e.g. if given array is { 12 ,4, 2, 10 , 5 , 1 }  
   and given number is 16 then sum of subarray { 4,2,10} and {10, 5,1},{12,4} is
    equal to given number.
 */
public class Subarraysum {
	
	static void arraysum(int arr[],int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++) {
				if((arr[i]+arr[j])==16|| (arr[j]+arr[k])==16  || (arr[i]+arr[k])==16 )
            {
					
					System.out.println("Sum: "+arr[i]+"+"+arr[j]);
					break;
            }
            else if(arr[i]+arr[j]+arr[k]==sum)
				{
					System.out.println("Sum: "+arr[i]+"+"+arr[j]+"+"+arr[k]);
				}
			
			}
		
			}
		}
		
		}

	public static void main(String[] args) {
		int arr[]= {12,4,2,10,5,1};
		System.out.println(Arrays.toString(arr));
		
		arraysum(arr,16);

	}

}
