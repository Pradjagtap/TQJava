package com.custom;

import java.util.Scanner;

public class InpurRange1 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		
		try {
			System.err.println("Enter number: ");
			int num=sc.nextInt();
			if(num>99999)
				throw new InvalidRangeException("Number should be less than than 99999");
			System.out.println("Number is  "+num);
		}
		
		finally
		{
			sc.close();
		}

	}

}