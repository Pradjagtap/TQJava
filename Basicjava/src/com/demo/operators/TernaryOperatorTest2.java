package com.demo.operators;

import java.util.*;
public class TernaryOperatorTest2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1,n2,min;
		
		System.out.println("Enter n1: ");
		n1=sc.nextInt();
		
		System.out.println("Enter n2: ");
		n2=sc.nextInt();
		
		min=n1<n2? n1:n2;
		
		System.out.println("Minimum number is: "+min);
		

	}

}
