package com.demo.anonymousinner;
import java.lang.annotation.*;
interface Doable
{
	void doIt();
}
class Car
{
	public void drive() {
		System.out.println("I am driving a car");
	}
}
abstract class Baking
{
	abstract void doBaking();
}
class Main1 implements Doable
{
	@Override
	public void doIt() {
		// TODO Auto-generated method stub

	}

}
public class AnonymousInnerDemo {

	public static void main(String[] args) {
		Doable d = new Doable() {

			@Override
			public void doIt() {

				System.out.println("I am doing my home task");

			}

		};

		d.doIt();

		Doable d1 = new Doable() {

			@Override
			public void doIt() {

				System.out.println("I am printing assignments");

			}

		};

		d1.doIt();

		// using concrete class

		Car c1 = new Car() {
			public void drive() {
				System.out.println("I am driving a BMW car");
			}

		};
		c1.drive();

		Car c2 = new Car() {
			public void drive() {
				System.out.println("I am driving a Honda car");
			}

		};
		c2.drive();
		
		//using abstract class
		
		Baking b1= new Baking() {

			@Override
			void doBaking() {
				System.out.println("I am baking cakes");
				
			}
			
			
		};
		b1.doBaking();
		
		Baking b2= new Baking() {

			@Override
			void doBaking() {
				System.out.println("I am baking biscuits");
				
			}
			
			
		};
		b2.doBaking();

	}




}
