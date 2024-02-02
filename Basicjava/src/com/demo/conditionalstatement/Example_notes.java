package com.demo.conditionalstatement;

import java.util.Scanner;
public class Example_notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int amount,n500,n200,n100,n50,n20,n10;
		System.out.println("Enter amount: ");
		amount=sc.nextInt();
		n500=0;
		n200=0;
		n100=0;
		n50=0;
		n20=0;
		n10=0;
		if(amount>=500)
		{n500=0;
			n500=amount/500;
			amount=amount%500;
			//System.out.println("One note of 500");
		}
		if(amount>=200)
		{
			n200=amount/200;
			amount=amount%200;
			//System.out.println("One note of 200");
		}
		if(amount>=100)
		{
			n100=amount/100;
		    amount=amount%100;
		    //System.out.println("One note of 100");
	    }
		if(amount>=50)
		{
			n50=amount/50;
		    amount=amount%50;
		    //System.out.println("One note of 50");
		}
		if(amount>=20)
		{
			n20=amount/20;
			amount=amount%20;
			//System.out.println("One note of 20");
		}
		if(amount>=10)
		{
			n10=amount/10;
			amount=amount%10;
			//System.out.println("One note of 10");
		}
		System.out.println("note of 500..."+n500);
		System.out.println("note of 200..."+n200);
		System.out.println("note of 100..."+n100);
		System.out.println("note of 50..."+n50);
		System.out.println("note of 20..."+n20);
		System.out.println("note of 10..."+n10);
		}
	}


