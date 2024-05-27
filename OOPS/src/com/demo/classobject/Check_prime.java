package com.demo.classobject;
//needs correction
import java.util.Scanner;

public class Check_prime {
	//data member
  int num;
     		
    	public Check_prime() {
    		num=11;
    	}
    	public Check_prime(int num) {
    		this.num=num;
    	}
    	public boolean primeCheck()
    	{
    		boolean flag=true;
    		for(int i=2;i<=num/2;i++) {
    			if(num%i==0) {
    			flag=false;
    					break;
    		}
    	} 
    	return flag;
    		}
    		
    		 	
           	public static void main(String[] args) {
           		Scanner sc=new Scanner(System.in);
           		int n;
           		System.out.println("Enter any number: ");
           		n=sc.nextInt();
           		Check_prime obj=new Check_prime();
           		obj.primeCheck();
           		if(obj.primeCheck()) {
           		System.out.println(obj.num+" is prime number");
           	}
           		else {
           			System.out.println(obj.num+" is not prime number");
           		           	}
           	}
}
        		
        	