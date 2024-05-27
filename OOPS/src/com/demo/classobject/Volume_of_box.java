package com.demo.classobject;
import java.util.Scanner;

/*13)Create class Box and calculate the volume of box
volume=length x width x height*/
class box{
	int length,width,height;
	public int calvolume() {
		return length*width*height;
	}
	
	public void setDetails() {
		length=2;
		width=3;
		height=5;
	}
	public void showDetails() {
		System.out.println("length: "+length);
		System.out.println("width: "+width);
		System.out.println("height: "+height);
	}
	
}

public class Volume_of_box {

	public static void main(String[] args) {
		box b1=new box();
		//Scanner sc=new Scanner(System.in);
		int length=0,width=0,height=0;
		b1.length=2;
		b1.width=3;
		b1.height=5;
		b1.setDetails();
		b1.showDetails();
		int volume=b1.calvolume();
		System.out.println("Volume of box is "+volume);

	}
}




