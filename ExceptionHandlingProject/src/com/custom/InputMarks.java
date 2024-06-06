package com.custom;

import java.util.Scanner;

public class InputMarks  {
	static void enterMarks() throws Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name:");
		
		String name= sc.next();
		
		System.out.println("Enter marks:");
		double marks= sc.nextDouble();
		
		// explicitly we are throwing an exception
		// we need to create instance of Exception
		try
		{
		  if(marks<0 || marks>100)
		  {
			throw new InvalidMarksExceptption("Invalid Marks:Marks should be between 0 an 100");
		  }
		  else
		  {
			if(marks>=33)
			{
				System.out.println(name+" has cleared the exam");
			}
			else
			{
				System.out.println(name+" has failed!!");
			}
	      }
		 }
		catch (Exception e) {
			//System.out.println(e);
			System.out.println("In method catch block");
			throw e; // rethrow
		}
		
		System.out.println("Rest code");
	}
	
	public static void main(String[] args) {
		
		try
		{
		enterMarks();
		}
		catch(Exception e)
		{
			System.out.println("In main catch");
			System.out.println(e);
		}
		
		
	}

}