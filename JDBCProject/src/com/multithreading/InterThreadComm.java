package com.multithreading;

import java.util.Scanner;

class Account
{
  volatile int balance=2000;
    
   synchronized void deposit()
    {
    	
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter deposit amount");
    		int damount=sc.nextInt();
    		balance=balance+damount;
    		System.out.println("balance after deposit"+balance);
    		notifyAll();
    	}
    
    
   synchronized void Withdraw(int wamount) throws InterruptedException
    {
    	
    	
    		
    		if(balance<wamount)
    		{
    			wait();
    			//System.out.println("cant withdraw");
    			
    		}
    		
    	
    	balance=balance-wamount;
    	System.out.println("balance after Withdraw"+balance);
    }
    	
    }

class Person1 extends Thread
{
	Account a;
	Person1(Account a)
	{
		this.a=a;
		this.start();
	}
	
	public void run()
	{
		try {
			
			a.Withdraw(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Person2 extends Thread
{
	Account a;
	Person2(Account a)
	{
		this.a=a;
		this.start();
	}
	
	public void run()
	{
		try {
			
			a.Withdraw(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class DepositThread extends Thread
{
	Account a;
	DepositThread(Account a)
	{
		this.a=a;
		this.start();
	}
	
	public void run()
	{
		
			a.deposit();
		
	}
	
}

public class InterThreadComm {

	public static void main(String[] args) {
		Account a=new Account();
		
		Person1 p1=new Person1(a);
		Person2 p2=new Person2(a);
		
		DepositThread d=new DepositThread(a);
		
	}

}
