package com.demo.conditionalstatement;

import java.util.*;
public class Nested_example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Qty,Bill=0;
		
		System.out.println("Enter a quantity: ");
		Qty=sc.nextInt();
		if(Qty>0) {
		
		if(Qty>50) {
			Bill=Qty*100;
			//System.out.println("Total bill of "+Qty+" is Rs "+Bill);
		}
		else if(Qty<50 && Qty>30) {
			Bill=Qty*125;
			//System.out.println("Total bill of "+Qty+" is Rs "+Bill);
		}
		else if(Qty<30) {
			Bill=Qty*140;
			//System.out.println("Total bill of "+Qty+" is Rs "+Bill);
		}
		
		System.out.println("Total bill of "+Qty+" is Rs "+Bill);
	
	   
		}
		else {
			System.out.println("Quantity shoiuld not be negative");
		}
	    }
	    	
		
		

	}


