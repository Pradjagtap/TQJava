package com.demo.assignment;
import java.util.Scanner;
//solve in class
public class Automorphic1 {
	public static void automorphicNumber(int num) {
		int temp,count=0,rem,num1;
		int power=1;
		temp=num;
		int square=num*num;
		while(temp!=0) {
			rem=temp%10;
			temp=temp/10;
			count++;
		}
		System.out.println("count: "+count);
		power=(int)Math.pow(10, count);
		System.out.println("power: "+power);
			num1=square%power;
		if(num1==num) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		}



	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		automorphicNumber(num);


	}

}
