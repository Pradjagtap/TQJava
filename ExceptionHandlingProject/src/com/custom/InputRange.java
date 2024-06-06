package com.custom;

import java.util.Scanner;

public class InputRange {

	public static void main(String[] args) {
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
