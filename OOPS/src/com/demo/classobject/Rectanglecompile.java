package com.demo.classobject;

//compilable
public class Rectanglecompile {
	double length;
	double breadth;

	public void setData(double len,double br) {
		length=len;
		breadth=br;
	}
	public void displayData() {
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
	}
	public double CalArea() {
		return length*breadth;
			}
	public double CalPerimeter() {
		return 2*(length+breadth);
	}
	
	}

