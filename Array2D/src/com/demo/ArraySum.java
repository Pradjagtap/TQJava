package com.demo;

import java.util.Scanner;

public class ArraySum {
	static void displayMultiarray(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		 
	}
	static void sumofRows(int ar[][]) {
		int sum=0;
			for(int i=0;i<ar.length;i++)
			{
				sum=0;
			for(int j=0;j<ar[i].length;j++)
			{
				
				sum=sum+ar[i][j];
			}
			System.out.println("Sum: "+sum);
	}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows: ");
		int rows=sc.nextInt();
		
		System.out.println("Enter columns in each row: ");
		int cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		
		//input the values
		
		System.out.println("-------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter values of row"+(i+1)+" :");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("-------------");
		displayMultiarray(arr);
		
		System.out.println("------------");
		sumofRows(arr);

	}
	

}
