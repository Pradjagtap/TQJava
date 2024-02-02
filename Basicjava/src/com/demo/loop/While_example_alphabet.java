package com.demo.loop;

import java.util.Scanner;

public class While_example_alphabet {
	public static void alphabet1() {
		char i;
		i='z';
		while(i>='a') {
			System.out.println(i);
			i--;
			
		}
		
	}
	public static void numbers(int n) {
		int i;
		i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}

	public static void main(String[] args) {
		alphabet1();
		int n=1;
		
		numbers(n);

	}

}
