package com.demo.conditionalstatement;

import java.util.*;
public class days_in_month {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Write a Java program print total number of days in a month
		
		int num,num1,num2,num3;
		int m;
		System.out.println("Enter month: ");
		m=sc.nextInt();
		//m=sc.next().charAt(0);
		num1=31;
		num2=30;
		num3=29;
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			System.out.println("Days in this month are "+num1);
		}
		else if (m==4 || m==6 || m==9 || m==11) {
			System.out.println("Days in this month are "+num2);
		}
		else if (m==2) {
			System.out.println("Days in this month are 28 or "+num3);
		}
		else {
			System.out.println("Month should be between 1 to 12");
		}
			
			
			
			
		}

	}

