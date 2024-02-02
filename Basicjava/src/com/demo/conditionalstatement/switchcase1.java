package com.demo.conditionalstatement;

import java.util.Scanner;
public class switchcase1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int a=1,b=3;
		System.out.println("-----welcome to myCafe----");
		System.out.println("1.Tea\n2.coffee\n3.cold drink\n");
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Tea Rs 30");
			break;
		case 2:
			System.out.println("coffee Rs 100");
			//break;
		case 3:
			System.out.println("cold drink Rs 50");
			break;
		case 5+6:
		//case 3://duplicate case no possible
		//case a+b://not possible
		default:
			System.out.println("invalid choice");
		}
		
		
	}

}