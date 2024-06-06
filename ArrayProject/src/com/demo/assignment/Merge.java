package com.demo.assignment;

import java.util.Arrays;

/*2>> Merge the two arrays as follows
ar1={1,2,3}
ar2={4,5,6,7,8}
o/p: mar1={1,4,2,5,3,6,7,8}
mar2={1,5,3,7,8}*/

public class Merge {
	
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
		int ar1[]= {1,2,3};
		int ar2[]= {4,5,6,7,8};
		
		System.out.println("Array 1: "+Arrays.toString(ar1));
		System.out.println("Array 2: "+Arrays.toString(ar2));
		
		int m[]=mergeAlternate(ar1,ar2);
		System.out.println("Array after alternate merging: "+Arrays.toString(m));
		
		int m1[]=mergeAlternateSkip(ar1,ar2);
		System.out.println("Array after alternate skip merging: "+Arrays.toString(m1));
		

	}

}
