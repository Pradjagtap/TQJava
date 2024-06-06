package com.demo.assignment;

import java.util.Scanner;

//Find the maximum number in an array
public class Alphabet {
	public static char max(char[]ch) {
		char c=ch[0];
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>c) {
				
			c=ch[i];
			}
	}
		return c;
	}

	public static void main(String[] args) {

		
		char[]ch= {'a','e','i','o','u'};
		
		Alphabet a=new Alphabet();
		System.out.println(a.max(ch));
	}

}

