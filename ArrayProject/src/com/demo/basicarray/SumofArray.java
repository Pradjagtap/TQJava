package com.demo.basicarray;

public class SumofArray {

	public static void main(String[] args) {
		int arr[]=new int[] {5,6,7,8,9};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			}
		System.out.println(sum);
	}

}
