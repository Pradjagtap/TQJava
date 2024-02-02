package com.demo.conditionalstatement;

import java.util.Scanner;
public class switchcase3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice;
		System.out.println("-----welcome to myCafe----");
		System.out.println("Tea\ncoffee\ncold drink\n");
		System.out.println("Enter choice:");
		choice=sc.next();
		
		switch(choice) {
		case "tea":
		case "TEA":
		case "Tea":
			System.out.println("Tea Rs 30");
			break;
		case "coffee":
		case "Coffee":
			System.out.println("coffee Rs 100");
			break;
		case "colddrink":
		
			System.out.println("cold drink Rs 50");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
