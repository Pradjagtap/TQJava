package com.demo.conditionalstatement;

import java.util.*;

public class Volume_of_cylinder {

	public static void main(String[] args) {
		
		int r,h;
		float v;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		r=sc.nextInt();
		System.out.println("Enter height: ");
				
		h=sc.nextInt();
		//pi=3.14
		//formula for volume of cylinder=pi*r*r*h
		v=3.14f*r*r*h;
		System.out.println("Volume of cylinder is "+v);
		
		
		
		
		
		
		

	}

}
