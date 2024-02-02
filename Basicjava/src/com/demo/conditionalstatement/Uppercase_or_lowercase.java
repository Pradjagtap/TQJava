package com.demo.conditionalstatement;

import java.util.Scanner;
public class Uppercase_or_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		char ch=sc.next().charAt(0);
		
		if(ch>=97 && ch<=122) {   //if(ch>=a && ch<=z)
			System.out.println(ch+" is a lowercase letter");
		}
		else if(ch>=65 && ch<=90) { //if(ch>=A && ch<=Z)
			System.out.println(ch+" is a Uppercase letter");
		}
		else {
			System.out.println(ch+" is a special character");
			
		}
	}

}
