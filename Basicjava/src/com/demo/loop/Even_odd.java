package com.demo.loop;
import java.util.Scanner;
public class Even_odd {
	
	public static void even(int n) {
		int i;
		for(i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
		}
				}
	public static void odd(int n) {
		int i;
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
		
		public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		i=sc.nextInt();
		even(i);
		odd(i);
		
		

	}

}
