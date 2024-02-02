package com.demo.conditionalstatement;

import java.util.Scanner;
public class Example_divisibility {

	public static void main(String[] args) {
		/*WAP to check whether it is divisible by 7 or not. if it is not divisible by 7 then which no 
		should be added in given number so number becomes divsible by 7
		eg 25 is not divisible by 7, add 3 to make number divisble by 7 */
 
			int num,add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		if(num%7==0) {
			System.out.println("number is divisible by 7");
		}
		else {
			System.out.println("Enter extra number you want to add: ");
			add=sc.nextInt();
			num=num+add;
					if(num%7==0) {
						System.out.println("Number is divisible by 7");
					}
		}
		
	}

}
