package com.demo.conditionalstatement;
import java.util.Scanner;
public class Example_electricity_bill {

	public static void main(String[] args) {
		/* 3. Write a Java program to input electricity consumption unit and calculate total electricity bill according to the given
		condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit
		above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill*/
		Scanner sc=new Scanner(System.in);
		double bill,units,finalbill;
		System.out.println("Enter units: ");
	    units=sc.nextDouble();
	  
	    
	    if(units<=50) {
	    	bill=units*0.50;
	    	finalbill=bill+0.2;
	    	System.out.println("Final amount is "+finalbill);
	    }
	    else if(units>50 && units<=100) {
	    	bill=units*0.75;
	    	finalbill=bill+0.2;
	    	System.out.println("Final amount is "+finalbill);
	    }
	    else if(units>100 && units<=200) {
	    	bill=units*1.20;
	    	finalbill=bill+0.2;
	    	System.out.println("Final amount is "+finalbill);
	    }
	    else if(units>=250) {
	    	bill=units*1.50;
	    	finalbill=bill+0.2;
	    	System.out.println("Final amount is "+finalbill);
	    	
	    	   	
	    	
	    }
		
		
	}

}
