package com.demo.classobject;

import java.util.Scanner;
public class Armstrong 
{
	int num;
	public Armstrong() {
		 num=123;
	}
	public Armstrong(int num) {
		this.num=num;
	}
	public int checkCount() {
		int count=0;
		
		int onum=num;
		while(onum!=0) {

			count++;
			onum=onum/10;
		}
		return count;

	}
	public  boolean testArmstrong() {
		int original=num;
		int rem;
		double sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		} 
		if(original==sum)
			return  true;
		else
			return false;



	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,num=0,original=0,sum=0;
		System.out.println("enter any number: ");
		n=sc.nextInt();
		Armstrong obj=new Armstrong(n);    
        if(obj.testArmstrong())
		 {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}


	}



}


