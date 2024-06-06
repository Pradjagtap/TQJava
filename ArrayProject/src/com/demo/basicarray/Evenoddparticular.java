package com.demo.basicarray;

import java.util.Arrays;

public class Evenoddparticular {
	public static void evenOdd(int arr[]) {
		int[]evenarr=new int[arr.length];
		int[]oddarr=new int[arr.length];
		int index1=0,index2=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenarr[index1++]=arr[i];
			}
			else {
				oddarr[index2++]=arr[i];
			}
		}
		System.out.println("Even array: "+Arrays.toString(evenarr));
		System.out.println("Odd array: "+Arrays.toString(oddarr));
	}

	public static void main(String[] args) {
		int[]arr= {56,46,78,55,44,33,11};
		evenOdd(arr);
		// TODO Auto-generated method stub

	}

}
