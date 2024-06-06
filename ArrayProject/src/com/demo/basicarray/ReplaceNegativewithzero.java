package com.demo.basicarray;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNegativewithzero {
	
	static void negativenumber(int arr[])
	{	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0) {
				arr[i]=0;
				
			}

		}
		System.out.println("Values: "+Arrays.toString(arr));
		}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[]= {1,2,3,-4,6};
		
		negativenumber(arr);
		

	}

}


