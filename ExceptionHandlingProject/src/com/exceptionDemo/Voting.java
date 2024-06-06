package com.exceptionDemo;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("enter your age: ");
			int age=sc.nextInt();
			if(age>=18)
			{
				System.out.println("Vote");
			}
			else
			{
				System.out.println("Cannot vote");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
			System.out.println("In finally block");
			
		}
		System.out.println("Vote ends...");
	}

}
