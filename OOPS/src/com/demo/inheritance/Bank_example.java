package com.demo.inheritance;

/*
 A bank has a principal amount and a rate of interest which is 2%. 
A savings account has a rate of interest 3% while a current account has 5%. 
Write a method that displays the rate of interest based on whether 
the account is default/ savings/ current.

 */
class Bank {
	double pamt;
	double rate;

	Bank() {

	}

	Bank(double pamt,double rate) {
		this.pamt = pamt;
		this.rate=rate;

	}

	public void setPamt(double pamt) {
		this.pamt = pamt;
		
	}

	public double getPamt() {
		return pamt;
	}
	public void setRate(double rate) {
		this.rate=rate;
	}
	public double getRate() {
		return rate;
	}

	public void displayInterest() {
		System.out.println("Rate of interest is: ");
	}

	public String toString() {
		return "Principal amount:" + pamt + "Rate: " + rate;
	}
}

class Saving_account extends Bank {
	double pamt;
	double rate;

	Saving_account() {

	}

	Saving_account(double pamt,double rate) {
		super(pamt,rate);
		this.pamt = pamt;

	}

	@Override
	public void setPamt(double pamt) {
		this.pamt = pamt;
	}

	public double getPamt() {
		return pamt;
	}
	public void setRate(double rate) {
		this.rate=rate;
	}
	public double getRate() {
		return rate;
	}
	public void displayInterest() {
		System.out.println("Rate of interest is 3%");
	}

	public String toString() {
		return "Principal amount:" + pamt + "Rate: " + rate;
	}
}

class Current_account extends Bank {
		double pamt;
		double rate;

		Current_account() {

		}

		Current_account(double pamt,double rate) {
			super(pamt,rate);
			this.pamt = pamt;
			this.rate=rate;

		}

		public void setPamt(double pamt) {
			this.pamt = pamt;
		}

		public double getPamt() {
			return pamt;
		}
		public void setRate(double rate) {
			this.rate=rate;
		}
		public double getRate() {
			return rate;
		}
		public void displayInterest() {
			System.out.println("Rate of interest is 5%");
		}

		public String toString() {
			return "Principal amount:" + pamt + "Rate: " + rate;
		}

	}


public class Bank_example {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setPamt(50000);
		b1.setRate(0.2);
		b1.displayInterest();
		System.out.println(b1);

		Saving_account s1 = new Saving_account();
		s1.setPamt(60000);
		s1.setRate(0.3);
		s1.displayInterest();
		System.out.println(s1);

		Current_account  c1 = new Current_account();
		c1.setPamt(75000);
		c1.setRate(0.5);
		System.out.println(c1);

	}

}
