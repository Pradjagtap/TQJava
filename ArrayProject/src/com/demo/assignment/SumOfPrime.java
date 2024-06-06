package com.demo.assignment;

public class SumOfPrime {
	public static boolean primesum(int n) {
		if(n<=1)
			return false;
		else {
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			return flag;
		}
			
		}		
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(primesum(arr[i]))
				sum=sum+arr[i];
		}
		System.out.println("Sum: "+sum);
	}

}
