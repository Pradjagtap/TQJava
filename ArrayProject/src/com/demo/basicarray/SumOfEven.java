package com.demo.basicarray;

import java.util.Scanner;

public class SumOfEven {
	public int evenSum(int[]arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int arr[]=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter any element:");
			arr[i]=sc.nextInt();
		}
		SumOfEven s1=new SumOfEven();
		//int[] ar= {1,2,3,4,5};
		System.out.println("Even sum: "+s1.evenSum(arr));
		
		
		
	}

}

