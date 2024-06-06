package com.demo.varags;

public class VaragsDemo {
	
	static void calcSum(int ar[])
	{
		int sum=0;
		for(int x:ar)
		{
			sum+=x;
		}
		System.out.println("Sum is:"+sum);
	}
	
	// ellipsis ...
	static void findSum(int ...ar)
	{
		int sum=0;
		for(int x:ar)
		{
			sum+=x;
		}
		System.out.println("Sum is:"+sum);
	}
	
	public static void main(String[] args) {
		
		int a1[]= {2,3};
		int a2[]= {4,5,6};
		int a3[]= {1,0,7,8,4};
		
		calcSum(a1);
		calcSum(a2);
		calcSum(a3);
		
		System.out.println("----------------------------");
		findSum(1,2,3);
		findSum(8,9);
		findSum(12,3,5,6,8,8);
		
		
	}

}