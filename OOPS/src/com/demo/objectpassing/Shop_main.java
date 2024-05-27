package com.demo.objectpassing;
import java.util.Scanner;

public class Shop_main {
	static Scanner sc=new Scanner(System.in);
	
	public static void enterItemDetails(Shop i) {
		System.out.println("Enter item id: ");
		i.setItemid(sc.nextInt());
		System.out.println("Enter item name: ");
		i.setItemname(sc.next());
		System.out.println("Enter cost of item: ");
		i.setItemcost(sc.nextDouble());
	}
	
	public static void main(String[] args) {
		Shop i1=new Shop();
		enterItemDetails(i1);
		System.out.println(i1);
		Shop i2=new Shop();
		

	}

}
