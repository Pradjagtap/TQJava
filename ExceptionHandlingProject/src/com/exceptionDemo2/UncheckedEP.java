package com.exceptionDemo2;
//Exception propagation

public class UncheckedEP {
	void method3()
	{
		int data=50/0;
	}
	void method2()
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
		UncheckedEP obj=new UncheckedEP();
		obj.method1();
	}

}
