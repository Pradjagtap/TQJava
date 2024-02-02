package com.demo.conditionalstatement;

import java.util.Scanner;
public class switchcase2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		System.out.println("-----welcome to myCafe----");
		System.out.println("a.Tea\nb.coffee\nc.cold drink\n");
		System.out.println("Enter choice:");
		choice=sc.next().charAt(0);
		
		switch(choice) {
		case 'a':
		case 'A':
			System.out.println("Tea Rs 30");
			break;
		case 'b':
		case 'B':
			System.out.println("coffee Rs 100");
			//break;
		case 'c':
		case 'C':
			System.out.println("cold drink Rs 50");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
