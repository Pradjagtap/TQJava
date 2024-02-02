package com.demo.conditionalstatement;
import java.util.Scanner;
public class Nested_if_else_2 {

	////WAP to check whether person is eligible for blood donation or not
	//if person's age is 18 or more than 18 as well as its weight should be 50 or more than 50
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age,weight;
		
		System.out.println("Enter age:");
		age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Enter weight:");
			weight=sc.nextInt();
			
			if(weight>=50) {
				System.out.println("your age and weight is valid for blood donation");
			}
			else {
				System.out.println("your weight is not for blood donation");

			}
		}
		else {
			System.out.println("you can not donate blood as you are below 18");
		}
		
	}

}