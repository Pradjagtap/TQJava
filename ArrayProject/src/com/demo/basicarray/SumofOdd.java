package com.demo.basicarray;
// Traverse the array and find the sum of odd elements in an array
import java.util.Scanner;

public class SumofOdd {
	public int oddSum(int[]arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
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
		SumofOdd s1=new SumofOdd();
		
		System.out.println("Odd sum: "+s1.oddSum(arr));
		
		
		
	}

}