package com.demo.assignment;
import java.util.Scanner;
//solve in session
public class Disarum_number1 {
	public static void disrumNumber(int num) {
		int sum=0,temp,count=0,power=1;
		temp=num;
		while(temp>0) {
			int rem=temp%10;
			count++;
			temp=temp/10;
			
		}
		int disrum=num;
		while(num>0)
		{
			int x=1;
			int rem=num%10;
			for(int i=1;i<=count;i++) {
				x=rem*x;
			}
			System.out.println(x);
			sum=sum+x;
			num=num/10;
			count--;
		}
		if(disrum==sum) {
			System.out.println("disarum number");
		}
		else {
			System.out.println("not disarum number");
			
		}
	}

	public static void main(String[] args) {
		int num,n=0;
		num=n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		disrumNumber(num);


	}

}
