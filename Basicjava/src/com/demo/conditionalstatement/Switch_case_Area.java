package com.demo.conditionalstatement;

import java.util.Scanner;
public class Switch_case_Area {
	Scanner sc=new Scanner(System.in);
	
	 //WAP in java using switch case for following: Area of a circle Area of a square Area of 
	 //	a right angled triangle Area of a rectangle Circumference of a circle Perimeter of a square 
	//Accept inputs like radius,side,etc through keyboard.
	public static void circle() {
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		double area, radius=0;
		System.out.println("Enter choice: ");
		choice=sc.nextInt();
		System.out.println("Enter radius: ");
		radius=sc.nextInt();
		switch(choice) {
	case 1:
			//Area of a circle = π × r^2
			area=3.14*radius*radius;
			System.out.println("Area of circle is "+area);
			break;
	case 2:
			//Circumference (or) perimeter of circle = 2πR
			area=2*3.14*radius;
			System.out.println("Area of circumference of circle is "+area);
			break;
		}
		}
			
	public static void square() {
		Scanner sc=new Scanner(System.in);
			int side=0,choice=0;
			double area,base,height;
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			System.out.println("Enter side: ");
			side=sc.nextInt();
			switch(choice) {
		case 1:
			
			//Area of a Square = Side × Side
			area=side*side;
			System.out.println("Area of square is "+area);
			break;
		
		case 2: 
			//Perimeter of a square=4*side
			area=4*side;
			System.out.println("Perimeter of a square is "+area);
			break;
			}
			}
			
	public static void triangle() {
		Scanner sc=new Scanner(System.in);
				int choice=0;
				double area,base=0,height=0;
				System.out.println("Enter base: ");
				base=sc.nextInt();
				System.out.println("Enter height: ");
				height=sc.nextInt();
				switch (choice) {
		case 5: 
				//A = 0.5 × b × h
				area=0.5*base*height;
				System.out.println("Area of right angled triangle is "+area);
				break;
			}
			}
	public static void rectangle() {
				int choice=0;
				double area,length=0,breadth=0;
				switch (choice) {
		case 6:
			//Area of rectangle = Length x Breadth
			area=length*breadth;
			System.out.println("Area of rectangle"+area);
			break;
				}
		
		
		/*default:
				System.out.println("invalid choice");*/
			
	}
	
     public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("1.Area of a circle\n2.Area of a square\n3.Area triangle\n4.Area of a rectangle\n");
		    int choice,side;
			//double radius,area,base,height,length,breadth;
		    System.out.println("Enter your choicce: ");
		    choice=sc.nextInt();
		    /*System.out.println("Enter radius: ");
			radius=sc.nextDouble();
			
			System.out.println("Enter base: ");
			base=sc.nextDouble();
			System.out.println("Enter height: ");
			height=sc.nextDouble();
			System.out.println("Enter length: ");
			length=sc.nextDouble();
			System.out.println("Enter breadth: ");
			breadth=sc.nextDouble();*/
			
			circle();
			square();
			triangle();
			rectangle();
			
			
		
		
    
			
			
		}
		
	}

