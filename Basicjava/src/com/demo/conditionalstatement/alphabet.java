package com.demo.conditionalstatement;

import java.util.*;
public class alphabet {

	public static void main(String[] args) {
		//4. Write a Java program to input any alphabet and check whether it is vowel or consonant
		
		Scanner sc=new Scanner(System.in);
		
		char alpha;
		
		System.out.println("Enter any character: ");
		alpha=sc.next().charAt(0);
		
		if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u') {
			System.out.println(alpha+" is a vowel");
		}
		else if(alpha=='$' || alpha=='.' || alpha=='@' || alpha=='!' || alpha=='#') {
			System.out.println(alpha+" it is a special character");
		}
		else {
			System.out.println(alpha+" it is a consonent");
		}
		
		
	    
	  
	    
		
	
			
		}
		
		
		
	}


