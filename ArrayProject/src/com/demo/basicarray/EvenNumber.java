package com.demo.basicarray;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		//int arr[]=new int[n];
		int a[]=new int[n];		
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Even numbers: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]%2==0) {
				System.out.println("even");
			}
			
			sc.close();
			
		}
		}

}


