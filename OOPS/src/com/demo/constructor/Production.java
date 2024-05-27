package com.demo.constructor;

class prodData{
	private int proid,price,quantity;
	private double discount,total_price;
	private String name;
	
	prodData(int proid,int quantity,String name){
		this.proid=proid;
		this.quantity=quantity;
		this.name=name;
	}
	public void setproid(int proid) {
		this.proid=proid;
	}
	public int getproid() {
		return proid;
		}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public int getquantity() {
		return proid;
		}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
		}
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("ProdId: "+proid);
		System.out.println("Quantity: "+quantity);
		System.out.println("Price: "+price);
		System.out.println("Discount: "+discount);
		System.out.println("Total price after discount is: "+total_price);
	}
	public void calculatePrice() {
		price=quantity*50;
		discount=price*0.20;
		total_price=price-discount;
		
		
	}
		
		//by using getter and setter
	}
	
	

public class Production {

	public static void main(String[] args) {
		
		prodData p1=new prodData(101,4,"Sugar");
		
		//System.out.println(p1);
		p1.calculatePrice();
		p1.displayDetails();
		
	

	}

}
