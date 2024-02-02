package com.demo.conditionalstatement;

import java.util.Scanner;

public class max_number {

	public static void main(String[] args) {
		//3. Write a Java program to find maximum between three numbers
		
		Scanner sc=new Scanner(System.in);
		
		double n1,n2,n3,max;
		System.out.println("Enter n1: ");
		n1=sc.nextDouble();
		
		System.out.println("Enter n2: ");
		n2=sc.nextDouble();
		
		System.out.println("Enter n3: ");
		n3=sc.nextDouble();
		
	    if(n1>n2 && n1>n3) {
	    	System.out.println(n1+" is the maximum number between "+n2+" and "+n3);
	    }
	    else if(n2>n1 && n2>n3) {
	    	System.out.println(n2+" is the maximum number between "+n1+" and "+n3);
	    }
	    else if(n3>n1 && n3>n2) {
	    	System.out.println(n3+" is the maximum number between "+n1+" and "+n2);
	    }
	    
	    }
		
		
	}

