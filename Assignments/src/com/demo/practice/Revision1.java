package com.demo.practice;
class Flower{
	void m1() {
		
	}
	static void m2() {
		
	}
	void m4() {
		
	}
}
class Rose extends Flower{
	//@Override
	void m1() {
		
	}
	void m3() {
		
	}
}
public class Revision1 {

	public static void main(String[] args) {
		Flower obj=new Flower();
		obj.m1();
		obj.m4();
		Flower obj1=new Rose();
		obj1.m1();
		obj1.m4();
	}

}
