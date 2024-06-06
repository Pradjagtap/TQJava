package com.exceptionDemo2;

import java.io.IOException;

//Exception propagation
public class CheckedEP {
	
	void method3() throws IOException
	{
		throw new IOException("Invalid input");
	}
	void method2()throws IOException
	{
		method3();
	}
	void method1() 
	{
		try
		{
			method2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CheckedEP obj=new CheckedEP();
		obj.method1();
	}

}
