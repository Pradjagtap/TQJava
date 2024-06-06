package com.demo.assignment;

import java.util.Scanner;

public class Searchelement {
	static boolean searchElements(int ar[],int ele)
	{	int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
				count++;
				return true;
		}
		return false;
	
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int[] arr=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter any element:");
		arr[i] = sc.nextInt();
		}
		
		Searchelement s1=new Searchelement();
		//System.out.println(s1);
		System.out.println("Enter search element: ");
		int search=sc.nextInt();
		System.out.println(s1.searchElements(arr,search));
		}
	}
	

	
	


