package com.demo.merging;

import java.util.Arrays;

public class Merge1 {
	static int[] mergeAll(int a1[], int a2[]) {
		int len1 = a1.length;
		int len2 = a2.length;

		int mar[] = new int[len1 + len2];
		int index = 0; // for the mar

		for (int i = 0; i < a1.length; i++) {
			mar[index++] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			mar[index++] = a2[i];
		}
		return mar;
	}

	static int[] mergeAlternate(int a1[], int a2[]) {
		int len1 = a1.length;
		int len2 = a2.length;
		int mar[] = new int[len1 + len2];

		int i, j, index;
		index = 0;
		for (i = 0, j = 0; i < len1 && j < len2; i++, j++) {
			mar[index++] = a1[i];
			mar[index++] = a2[j];
		}
		while (i < len1) {
			mar[index++] = a1[i++];
		}
		while (j < len2) {
			mar[index++] = a2[j++];
		}
		return mar;
	}

	static int[] mergeAlternateSkip(int a1[],int a2[])
	{
		int len1=a1.length;
		int len2=a2.length;
		int maxLengths=Math.max(len1, len2);
		int mar[]=new int[maxLengths];
		int index=0;
		int i=0;
		while(index<maxLengths) 
		{
			if(i<a1.length) 
			{
				mar[index++]=a1[i++];
			}
		    if(i<a2.length)
		    {
			    mar[index++]=a2[i++];
		    }
		}
		return mar;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 8, 9, 10, 12, 14 };
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int m[] = mergeAll(arr1, arr2);
		System.out.println("After merge all array: ");
		System.out.println(Arrays.toString(m));

		int m1[] = mergeAlternate(arr1, arr2);
		System.out.println("After merge alternate: ");
		System.out.println(Arrays.toString(m1));

		int m2[] = mergeAlternateSkip(arr1, arr2);
		System.out.println("After merge alternate skip: ");
		System.out.println(Arrays.toString(m2));

	}

}
