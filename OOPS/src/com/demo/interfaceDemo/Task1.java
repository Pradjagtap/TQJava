package com.demo.interfaceDemo;
/*
 Create an example to show the usage of default, static and private method in interface
 */

interface Shop {
	void showDetails();

default void listItems() {
	
	System.out.println("List of items");//default method
	margin(10);
}
private void margin(int a) {
	System.out.println("Margin");//private method
}
static void getDiscount() {
	System.out.println("Discount is 10%");
	
}
	
}
class Grocery implements Shop{
	int items;
	Grocery(){
		
	}
	Grocery(int items){
		this.items=items;
	}
	@Override
	public void showDetails() {
		System.out.println("This part of shop is grocery type");
		
	}

	
	}
class Stationery implements Shop{
	String types;
	
	Stationery(String types){
		this.types=types;
	}
		@Override
		public void showDetails() {
			System.out.println("This part of shop is"+ types+"types");
		}
	}
	
public class Task1 {

	public static void main(String[] args) {
		Shop s;
		Shop.getDiscount();
		s=new Grocery();
		s.listItems();
		s.showDetails();
					
		s=new Stationery("Stationery");
		s.listItems();
		s.showDetails();

	}

}
