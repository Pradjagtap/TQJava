package com.demo.objectpassing;

public class MyShop {
	static double discount;
	static String brand;
	static int icount=0;
	
	static {
		
	System.out.println("My grocery shop: ");
	//called once
	//System.out.println("Item added: ");
	//icount++;
	}
   static {
		System.out.println("Discount on all items: ");
		discount=0.1;
		brand="Patanjali";
		
	}
	{
    System.out.println("In instance block");
    brand="Nestle";
    System.out.println("Item added...");
    icount++;
	}
	MyShop()
	{
		brand="Saffola";
	}
	//setget from Shop
	
}
