package com.demo.intermediate;

import java.util.Arrays;

// Find the max and minimum number from an array and swap their positions
//eg:{1,2,3,4,5,6}
//o/p:{6,2,3,4,5,1}
public class SwapMaxMin {
	public static void maxmin(int arr[]) {
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int cmin=0,cmax=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
				cmax=i;
				
			}			
				if(arr[i]<min) {
				min=arr[i];
				cmin=i;
				}
		}
				{
			
				int temp=arr[cmax];
				arr[cmax]=arr[cmin];
		          arr[cmin]=temp;
			}
				//System.out.println(Arrays.toString(arr));
				System.out.println("Max: "+max);
				System.out.println("Min: "+min);
		}
		
	
		
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr));
		maxmin(arr);
		System.out.println(Arrays.toString(arr));

	}

}
