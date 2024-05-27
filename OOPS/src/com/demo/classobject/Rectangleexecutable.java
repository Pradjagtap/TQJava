package com.demo.classobject;
import java.util.Scanner;
public class Rectangleexecutable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double len,br;
		System.out.println("Enter len: ");
		len=sc.nextDouble();
		System.out.println("Enter breadth: ");
		br=sc.nextDouble();
				
		Rectanglecompile r1=new Rectanglecompile();
		r1.setData(len,br);
		r1.displayData();
		System.out.println("Area: "+r1.CalArea());
		System.out.println("Perimeter: "+r1.CalPerimeter());

	}

}
