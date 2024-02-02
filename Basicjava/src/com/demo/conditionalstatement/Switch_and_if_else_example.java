package com.demo.conditionalstatement;

import java.util.Scanner;
import java.util.Date;
public class Switch_and_if_else_example {

	public static void main(String[] args) {
		Date d=new Date();
		Scanner sc=new Scanner(System.in);
		String name;
		int choice;
		int coupon;
		double amount;		
		String bp=null,des=null,ans;
		System.out.println("Welcome to Airlines");
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Hello "+name);
		
		System.out.println("1.Lufthansa\n2.AirArabia\n3.Indigo");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		
		
		
		switch(choice) {
		case 1:
			System.out.println("Enter your boarding place: ");
			bp=sc.next();
			
			System.out.println("Enter your destination: ");
			des=sc.next();
			
			System.out.println("Your amount will be Rs 20,000");
			System.out.println("Do you have any coupon? ");
			System.out.println("Enter your ans: ");
			coupon=sc.nextInt();
						
			if(coupon==1) {
				System.out.println("Yes");
			    amount=20000;
				System.out.println("Discount offer is 25% on your amount");
				amount=amount-amount*0.25;
				System.out.println("After discount amount is "+amount);
			}
			else if(coupon==0) {
				System.out.println("No");
			}
			
			
			break;
		case 2:
		
			System.out.println("Enter your boarding place: ");
			bp=sc.next();
			//System.out.println("My boarding place is "+bp);
			System.out.println("Enter your destination: ");
			des=sc.next();
			
			System.out.println("Your amount will be Rs 25,000");
			System.out.println("Do you have any coupon? ");
			System.out.println("Enter your ans: ");
			coupon=sc.nextInt();
						
			if(coupon==1) {
				System.out.println("Yes");
				amount=25000;
				System.out.println("Discount offer is 25% on your amount");
				amount=amount-amount*0.25;System.out.println("After discount amount is "+amount);
			}
			else if(coupon==0) {
				System.out.println("No");
			}
			break;
			
		case 3:
		{
			System.out.println("Enter your boarding place: ");
			bp=sc.next();
			//System.out.println("My boarding place is "+bp);
			System.out.println("Enter your destination: ");
			des=sc.next();
			
			System.out.println("Your amount will be Rs 30,000");
			System.out.println("Do you have any coupon? ");
			System.out.println("Enter your ans: ");
			coupon=sc.nextInt();
						
			if(coupon==1) {
				System.out.println("Yes");
				amount=30000;
				System.out.println("Discount offer is 25% on your amount");
				amount=amount-amount*0.25;
				System.out.println("After discount amount is "+amount);
			}
			else if(coupon==0) {
				System.out.println("No");
			}
			
		    
		
		break;
		}
	
		}
		System.out.println(name+" your tickets has been booked from "+bp+" to "+des+"on this date"+d);
		
	}
}
			
			
			
			
		
		
		
		
		
		



