package com.demo.assignment;

import java.util.Scanner;

//Print the alternate numbers of an array
public class Alternate {
	public static void altnum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
				arr[i]=arr[i]+2;
				System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter any element:");
			arr[i] = sc.nextInt();
		}
		Alternate a1=new Alternate();
		a1.altnum(arr);

	}
}

