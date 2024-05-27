package com.demo.interfaceDemo;
/*
 Create an online shopping which has various modes to pay the Bill
If paid through cash.. no discount
Paytm ... above 1000,, cashback 500
Credit card .. any amount : 20% discount
Debit card.... above 5000 : 20% discount
Try to the pay bill using different modes

 */
interface OlPayment {
	 void shopping(String s);
	void paymentprocess(int amount);
	
}
class Cash implements OlPayment{
	int cash;
	Cash(){
		
	}
	Cash(int cash){
		this.cash=cash;
	}
	@Override
	public void paymentprocess(int amount) {
		System.out.println("Cash payment");
		System.out.println("No discount");
		
	}
	@Override
	public void shopping(String s) {
		System.out.println("Online shopping by cash");		
	}
	
}
class Paytm implements OlPayment{
	
	@Override
	public void paymentprocess(int amount) {
		if(amount>1000) {
			System.out.println("Cashback is 500");
		}
		else {
			System.out.println("No cashback");
		}
		
	}

	@Override
	public void shopping(String s) {
		System.out.println("Online shopping using Paytm");
		
	}
	
	
}
class Credit_card implements OlPayment{
	double discount;
	double total_amount;
	@Override
	public void paymentprocess(int amount) {
		discount=amount*0.20;
		total_amount=amount-discount;
		
		System.out.println("Final amount is: "+total_amount);
		
	}
	@Override
	public void shopping(String s) {
		System.out.println("Online shopping using Credit card");
		
	}
	
}
class Debit_card implements OlPayment{
	double discount,total_amount;
	
	@Override
	
	public void paymentprocess(int amount) {
		if(amount>5000) {
		discount=amount*0.20;
		total_amount=amount-discount;
		System.out.println("Final amount is: "+discount);
		}
		else {
			System.out.println("No discount");
		}
	}
	
		@Override
		public void shopping(String s) {
			System.out.println("Online shopping using debit card");
			
		}
	}
public class Task2 {
	public String s;
	private int amount;
	
	public static void main(String[] args) {
		OlPayment o1;
		o1=new Debit_card();
		o1.paymentprocess(60000);
		o1.shopping("Payment mode: ");
		
		o1=new Credit_card();
		o1.paymentprocess(4000);
		o1.shopping("Credit card");
		
		
		

	}


}

