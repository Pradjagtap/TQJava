package com.demo.basicarray;

import java.util.Arrays;
import java.util.Scanner;

public class Cube {
	static int i;
	void cubeofNum(int[] arr) {
		for (i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i] * arr[i];
			System.out.println(arr[i]);
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
		Cube c1 = new Cube();
		 c1.cubeofNum(arr);
		

	}
	

}
