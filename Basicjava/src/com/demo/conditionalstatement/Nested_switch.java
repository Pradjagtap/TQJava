package com.demo.conditionalstatement;

import java.util.Scanner;

public class Nested_switch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		String vegetables,color;
		
		System.out.println("1.Capsicum\n2.Potato\n");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter color of your choice: ");
			color=sc.next();
			switch(color) {
			case "Red":
				System.out.println("Red capsicum");
				break;
			case "Yellow":
				System.out.println("Yellow capsicum");
				break;
			case "Green":
				System.out.println("Green capsicum");
				break;
			}
			break;
		case 2:
			System.out.println("Potato");
			break;
		default:
			System.out.println("invalid choice");
				
		}
		
	}

}
