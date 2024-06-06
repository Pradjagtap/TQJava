package com.demo.assignment;
import java.util.Scanner;

public class ATM_transaction_do_while {
	
	public static void transaction() {
		Scanner sc=new Scanner(System.in);
		int pin=1111;
		//int amount=5000;
		int balance=5000;
		//balance=amount-balance;		
		System.out.println("Enter your pin: ");
		int correct_pin=sc.nextInt();
		int choice;
		
		char ch;
		if(pin==correct_pin) {
			
			do {
				System.out.println("Enter choice: ");
				choice=sc.nextInt();
				switch(choice) {
				case 1: 
					System.out.println("Enter your amount to withdraw: ");
					int withdraw=sc.nextInt();
										
					if(withdraw<balance) {
						System.out.println("You withdraw your amount successfully");
						System.out.println("Do you want to check balance?");
						balance=balance-withdraw;
						
					}
					
		
					break;
				case 2: 
					System.out.println("Enter the amount you want to deposit: ");
					int deposit=sc.nextInt();
					balance=balance+deposit;
					System.out.println("You have successfully deposited your amount");
					//balance
						break;
						
				case 3:
					
					System.out.println("Your balance is: "+balance);
					break;
				}
				
				System.out.println("Do you want to continue? Yes or no");
			 ch=sc.next().charAt(0);
			}while(ch!='n');
		}
			else
			{
			 System.out.println("Your pin is incorrect");
		}
	}
										
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String username=sc.next();
		System.out.println("Welcome to ATM");
		System.out.println("Welcome "+username);
		System.out.println("1.Withdraw\n2.Deposit\n3.check balance");
		int choice,n=0;
		
	    transaction();
	    
	
	}
}
	

