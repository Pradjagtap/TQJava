package com.exceptionDemo;

public class SecondException {

	public static void main(String[] args) {
		
		try
		{
			String s="j";
			System.out.println(s.length());
			
			int arr[]= {1,2,3};
			System.out.println("Value: "+arr[3]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest code");

	}

}
