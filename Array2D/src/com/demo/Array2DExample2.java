package com.demo;

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */

public class Array2DExample2 {
	
		
	public static void main(String[] args) {
			
	//	int arr[][]= {{1,1},{2,2},{3,3},{4,4}};	
		int arr[][]= new int [][]{{1,1},{2,2},{3,3},{4,4}};
		
		System.out.println("-----------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int a:arr[i])
			{
				System.out.print(a+" ");
				
			}
			
			System.out.println();
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