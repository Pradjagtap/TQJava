package com.treemapDemo;

import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Order,Customer> tmap=new TreeMap<>();
		
		tmap.put(new Order(102,"Burger",500), new Customer(1,"Supriya",(long) 89457676));
		tmap.put(new Order(102,"Fries",100), new Customer(2,"Anita",(long) 6586987));
		tmap.put(new Order(102,"Juice",250), new Customer(3,"Pravin",(long) 9866576));
		tmap.put(new Order(102,"Pizza",800), new Customer(1,"Supriya",(long) 98567565));
		tmap.put(new Order(102,"Brownie",520), new Customer(2,"Anita",(long) 9956778));
		
		
		
		
		
		
	}

}
