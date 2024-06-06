package com.demo.intermediate;

public class SumofPrime {
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
		int arr[]= {13,11,3,4,5,6,7};
		int sum=0;
		for(int x:arr) {
			if(primesum(x))
				sum=sum+x;
		}
		System.out.println(sum);
			
		}
}
		
	



