package com.exceptionDemo;

import java.util.Scanner;

public class MultiCatchArrayTry2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int x=15;
			int y=0;
			int n=x/y;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest code");
	

}
}
