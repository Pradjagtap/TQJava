package com.demo.basicarray;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
	public static void evenodd(int arr[]) {
		int[] evenarr=new int[arr.length];
		int[] oddarr=new int[arr.length];
		int j=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenarr[j++]=arr[i];
			}
			else {
				oddarr[k++]=arr[i];
			}
		}
		System.out.println("Even: "+Arrays.toString(evenarr));
		System.out.println("Odd: "+Arrays.toString(oddarr));
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter elements: ");
			arr[i]=sc.nextInt();
		}
		EvenOdd e1=new EvenOdd();
		e1.evenodd(arr);
		//evenodd(arr);
	
	}

}
