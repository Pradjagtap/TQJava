package com.exceptionDemo2;

import java.io.IOException;

public class ThrowsDemo2 {
	public static void main(String[] args) 
	{
		
		//throw new ArithmeticException("not a value");
		try
		{
		
		throw new IOException("Invalid input");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
