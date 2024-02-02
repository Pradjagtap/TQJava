package com.demo.conditionalstatement;

import java.util.Scanner;
public class Triangle_example {

	public static void main(String[] args) {
		/*Write a Java program Check whether the triangle is equilateral, scalene, or isosceles
		Before writing the program, we should know the properties of isosceles, equilateral, and scalene triangles.
		Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length.
		Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal.
		Scalene triangle: A scalene triangle is a triangle that has three unequal sides.*/
		
		Scanner sc=new Scanner(System.in);
		double len1,len2,len3;
		System.out.println("Enter length of triangle side1: ");
		len1=sc.nextDouble();
		System.out.println("Enter length of triangle side2: ");
		len2=sc.nextDouble();
		System.out.println("Enter length of triangle side3: ");
		len3=sc.nextDouble();
		
		if((len1==len2 && len1!=len3)|| (len2==len3 && len2!=len1)|| (len1==len3 && len1!=len2)) {
			System.out.println("A triangle is an isosceles triangle");
		}
		else if(len1==len2 && len2==len3 && len1==len3) {
			System.out.println("A triangle is an equilateral triangle");
		}
		else if(len1!=len2 && len2!=len3 && len1!=len3) {
			System.out.println("A triangle is an scalene triangle");
			
		}
		

	}

}
