package com.demo.conditionalstatement;

import java.util.Scanner;
public class Grade_example_if_else {

	public static void main(String[] args) {
		// Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
		//Percentage >= 90% : Grade A
		//Percentage >= 80% : Grade B
				/*Percentage >= 70% : Grade C
				Percentage >= 60% : Grade D
				Percentage >= 40% : Grade E
				Percentage < 40% : Grade F*/
		Scanner sc=new Scanner(System.in);
		int Phy,Chem,Bio,Maths,Comp,Total;
		double divide,percent;
		System.out.println("Enter Marks in Physics: ");
		Phy=sc.nextInt();
		System.out.println("Enter Marks in Chemistry: ");
		Chem=sc.nextInt();
		System.out.println("Enter Marks in Biology: ");
		Bio=sc.nextInt();
		System.out.println("Enter Marks in Mathematics: ");
		Maths=sc.nextInt();
		System.out.println("Enter Marks in Computer: ");
		Comp=sc.nextInt();
		Total=Phy+Chem+Bio+Maths+Comp;
		divide=Total/500;
		percent=divide*100;
		if(percent>=90) {
			System.out.println("Grade A");
		}
		else if(percent>=80) {
			System.out.println("Grade B");
		}
		else if(percent>=70) {
			System.out.println("Grade C");
		}
		else if(percent>=60) {
			System.out.println("Grade D");
		}
		else if(percent>=40) {
			System.out.println("Grade E");
		}
		else if(percent<40) {
			System.out.println("Grade F");
		}
	}

}
