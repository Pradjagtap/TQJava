package com.demo.interfaceDemo;

interface programmer 
{
	default void work() {
		System.out.println("Hardworking");
	}
}
interface Manager extends programmer
{
	default void work() {
		programmer.super.work();
		System.out.println();
	}
	
}
public class DiamondProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
