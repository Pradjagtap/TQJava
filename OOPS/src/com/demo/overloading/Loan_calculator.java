package com.demo.overloading;
import java.util.Scanner;
/*Task4>
You have to build a loan calculator.
 If a single rate of doubleerest is provided then it is a housing loan 
and loan is principal amount * (100 + rate) 
If two values are provided then it is a commercial loan 
and loan is principal amount * (value 1 + value 2 +100)*/
class Calculator {
	private double p_amount, rate;
	private double value1, value2;
	private double total,total1;

	Calculator() {

	}

	Calculator(double p_amount, double rate) {
		this.p_amount = p_amount;
		this.rate = rate;

	}

	Calculator(double p_amount, double value1, double value2) {
		this.p_amount = p_amount;
		this.value1 = value1;
		this.value2 = value2;

	}

	public void setPamount(double p_amount) {
		this.p_amount = p_amount;
	}

	public double getPamount() {
		return p_amount;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue1() {
		return value1;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

	public double getValue2() {
		return value2;
	}

	public double calculateloan(double p_amount,double rate) {
		total = p_amount * (100 + rate);
		return total;

	}

	public double calculateloan(double p_amount,double value1,double value2 ) {
		total = p_amount * (value1 + value2 + 100);
		return total;
	}
	
	
	public void displayDetails() {
		System.out.println("Final amount of Home loan is: "+total);
		System.out.println("Final amount of commercial loan is: "+total);
	}


}

public class Loan_calculator {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		System.out.println("Enter principal amount: ");
		c1.setPamount(sc.nextDouble());
		System.out.println("Enter rate: ");
		c1.setRate(sc.nextDouble());
		System.out.println("Enter value1: ");
		c1.setRate(sc.nextDouble());
		System.out.println("Enter value2: ");
		c1.setRate(sc.nextDouble());
	    System.out.println(c1.calculateloan(500000,2));
		System.out.println(c1.calculateloan(500000,2,3));
		

//		Calculator c2 = new Calculator();
//		System.out.println("Enter principal amount: ");
//		c2.setPamount(sc.nextDouble());
//		System.out.println("Enter value1: ");
//		c2.setRate(sc.nextDouble());
//		System.out.println("Enter value2: ");
//		c2.setRate(sc.nextDouble());		
//		System.out.println(c2.calculateloan());
//		

	}

}
