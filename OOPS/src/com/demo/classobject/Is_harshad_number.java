package com.demo.classobject;

import java.util.Scanner;
public class Is_harshad_number
{
	int num,rem;
	int count,sum=0;
	int temp=num;
	public Is_harshad_number () {
		num=155;
	}
	public Is_harshad_number(int num) {
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
	public boolean harshad_number() {
		int onum=0,num1=0;
	while(onum!=0) {
		rem=onum%10;
		sum=sum+rem;
		onum=onum/10;
		count++;
	}
	num1=num%sum;
			
	if(num1==0) {
		return true;
	}
	else {
		return false;
	}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		Is_harshad_number obj=new Is_harshad_number(n);
		if(obj.harshad_number())
		 {
			System.out.println("Harshad number");
		}
		else {
			System.out.println("Not harshad number");
		}
	}

}
