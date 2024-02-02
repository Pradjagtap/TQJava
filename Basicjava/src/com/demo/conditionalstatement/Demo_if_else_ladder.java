package com.demo.conditionalstatement;

public class Demo_if_else_ladder {

	public static void main(String[] args) {
		
		int marks=32;
		
		if(marks>=65) {
			System.out.println("Grade A");
		}
		else if(marks<65 && marks>=55) {
			System.out.println("Grade B");
		}
		else if(marks<55 && marks>=35) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		
		}

	}

}
