package com.demo.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SquareCube {
	public static void square(int ar[]) {
		int i;
		int sq[]=new int[ar.length];
		for(i=0;i<ar.length;i++) {
			sq[i]=ar[i]*ar[i];
		}
		System.out.println(Arrays.toString(sq));
	}
	public static void cube(int ar[]) {
		int cube[]=new int[ar.length];
		int i;
		for(i=0;i<ar.length;i++) {
			cube[i]=ar[i]*ar[i]*ar[i];
		}
		System.out.println(Arrays.toString(cube));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter length: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("\n1.Square\n2.Cube");
		System.out.println("Enter choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
			square(arr);
			break;
			
		case 2: 
			cube(arr);
			break;
		}
		sc.close();
	}

}
