package com.demo;
import java.util.Scanner;

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */

public class Array2DExample3 {
	
		
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			
		int arr[][]= new int[3][3];
		
		System.out.println("-----------------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter values of row"+(i+1)+":");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]= sc.nextInt();
			}
			
		}
		
		System.out.println("-----------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}

