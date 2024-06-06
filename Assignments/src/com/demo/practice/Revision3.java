package com.demo.practice;

interface Parent1{
	void show();
	default void display() {
		System.out.println("I am parent1");
	}
}
interface Parent2{
	void show();
	default void display() {
		System.out.println("I am parent2");
	}
	
}
public class Revision3 implements Parent1,Parent2{
	
	//@Override
	public void show() {
		System.out.println("Parent");
		
	}
	public void display() {
		Parent1.super.display();
		Parent2.super.display();
	}

	public static void main(String[] args) {
		
		Parent1 p;
		p=new Revision3();
		p.display();
		
		Parent2 p2;
		p=new Revision3();
		p.display();
		
	}

}
