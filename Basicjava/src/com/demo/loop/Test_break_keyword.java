package com.demo.loop;
import java.util.Scanner;

public class Test_break_keyword {
	public static void printNo() {
		for(int i=1;i<=10;i++) {
			if(i==5)
				break;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		printNo();
	}

}
