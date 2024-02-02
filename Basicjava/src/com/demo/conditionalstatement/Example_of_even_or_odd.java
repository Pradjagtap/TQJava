package com.demo.conditionalstatement;

import java.util.*;
public class Example_of_even_or_odd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num: ");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		
		}
		
		
		
	}

}
