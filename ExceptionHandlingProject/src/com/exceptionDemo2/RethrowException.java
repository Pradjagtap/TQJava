package com.exceptionDemo2;

public class RethrowException {
	static void method1()
	{
		try
		{
		String s= null;
		System.out.println(s.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("In method1 catch block");
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		
		method1();
		
		
	}


}
