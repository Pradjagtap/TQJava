package com.demo.practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number: ");
			int n;
			n=sc.nextInt();
			
			if(n%2==0) {
				System.out.println("number is even");
				if(n%6==0) {
					System.out.println("Number is divisible by 6");
				}
				else {
					System.out.println("number is not divisible by 6");
				}
			}
				else {
					System.out.println("Number is odd");
					if(n%5==0) {
						System.out.println("Number is divisible by 5");
					}
					else {
						System.out.println("Number is not divisible by 5");
					}
				}
				}
			
		}



