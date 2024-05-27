package com.demo.interfaceDemo;
/*
 Create an interface to pay any amount . It can be used by employee or celebrity to pay the tax a
and by a student to pay the fees
Use the concept of functional interface here
 */
interface Pay{
	void payment(int amount);
	
}
class Employee implements Pay{

	@Override
	public void payment(int amount) {
		System.out.println("Employee will pay tax "+amount);
		
	}
	
}
class Celebrity implements Pay{

	@Override
	public void payment(int amount) {
		System.out.println("Celebrity wil pay tax "+amount);
		
	}
	
}
class Student1 implements Pay{

	@Override
	public void payment(int amount) {
		System.out.println("Student will pay fees "+amount);
		
	}
	
}
public class Task3 {

	public static void main(String[] args) {
		Pay p;
		p=new Employee();
		p.payment(50000);
	
		p=new Celebrity();
		p.payment(5000000);
		
		p=new Student1 ();
		p.payment(5000);
	}

}
