package com.exceptionDemo;

import java.util.Scanner;

public class Voting1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		try
		{
			if(age<0) {
				throw new RuntimeException("Invalid age");
			}
			else {
				
			if(age>=18)
			{
				System.out.println("Vote");
			}
			else
			{
				System.out.println("Cannot vote");
			}
			}
		}
		catch (Exception e)
		{
			throw e;
		}
		
		System.out.println("Vote ends...");
	}

}

