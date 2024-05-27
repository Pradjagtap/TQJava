package com.demo.assignment;

public class SumOfIntegersinString {
	
	static void findSum(String s)
	{
		int sum=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(arr[i]))
			{
				int x=Character.getNumericValue(arr[i]);
				sum=sum+x;
			}
		}
		System.out.println("Sum is: "+sum);
	}
	static void findSum2(String s)
	{
		int sum=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]>48 && arr[i]<57)
			{
				int x=arr[i]-48;
				sum=sum+x;
			}
		}
		System.out.println("Sum is: "+sum);
	}
	static void average(String s)
	{
		int sum=0;
		int count=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]>48 && arr[i]<57)
			{
				int x=arr[i]-48;
				sum=sum+x;
				count++;
				
			}
		}
		System.out.println("Average is: "+sum/count);
	}

	public static void main(String[] args) {
		String s="Sachin scores 22222 runs in test match";
		findSum(s);
		findSum2(s);
		average(s);

	}

}
