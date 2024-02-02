package com.demo.loop;
import java.util.Scanner;
//do..while checks condition at last
//hence it runs at least once
public class Do__while_loop {
	public static void show(int n) {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		
	}

	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		show(n);
		

	}

}
