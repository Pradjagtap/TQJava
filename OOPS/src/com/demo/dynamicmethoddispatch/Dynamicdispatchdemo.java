package com.demo.dynamicmethoddispatch;

class Bank {
	public double rate;

	void getRateOfIOnterest() {
		rate = 9;
		System.out.println("Rate  of interest is: " + rate + "%");
	}
}

class SBIBank extends Bank {
	void getRateOfIOnterest() {

		rate = 8.5;
		System.out.println("Rate  of interest is: " + rate + "%");
	}
		
		void showBankdetails() {
			System.out.println("Details");
		}

	}


class HDFCBank extends Bank {
	void getRateOfIOnterest() {
		rate = 9.5;
		System.out.println("Rate  of interest is: " + rate + "%");
	}

public class Dynamicdispatchdemo {

	public static void main(String[] args) {
		Bank b;
		b=new SBIBank();
		b.getRateOfIOnterest();
		//b.showBankdetails();
		
		b=new HDFCBank();
		b.getRateOfIOnterest();
		
		System.out.println("---------");
		SBIBank s1=new SBIBank();
		s1.getRateOfIOnterest();
		s1.showBankdetails();

	}

}
}
