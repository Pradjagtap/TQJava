package com.mapDemo.HashmapDemo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ItemSupplierLinkedHashMap {
	static void createMap(ArrayList<Item> list)
	{
	  LinkedHashMap<Supplier, ArrayList<Item>> lhm= new LinkedHashMap<>();
	  ArrayList<Item> items;
	  
	  for(Item i:list)
	  {
		 if(lhm.containsKey(i.getSupplier()))
		 {
			items= lhm.get(i.getSupplier());
			items.add(i);
			lhm.put(i.getSupplier(), items);
		 }
		 else
		 {
			items= new ArrayList<>();
			items.add(i);
			lhm.put(i.getSupplier(), items);
		 }
	  }
	  
	  for(Map.Entry<Supplier, ArrayList<Item>> e: lhm.entrySet())
	  {
		  System.out.println("Supplier:"+e.getKey());
		  System.out.println("Items Supplied:");
		  for(Item i:e.getValue())
		  {
			  System.out.println("Id:"+i.getId()+",Name:"+i.getIname()+",Price:"+i.getCost());
		  }
		  
		  System.out.println("-----------------------------------------------------");
	  }
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Item> al= new ArrayList<>();
		al.add(new Item(101, "Rice", 30.0, new Supplier(1, "Monica", 985544344)));
		al.add(new Item(102, "Sugar", 25.0, new Supplier(2, "Harshit", 908723725)));
		al.add(new Item(103, "Flour", 20.0, new Supplier(1, "Monica", 985544344)));
		al.add(new Item(104, "Juice", 50.0, new Supplier(3, "Pradnya", 862754723)));
		al.add(new Item(105, "Tea", 15.0, new Supplier(2, "Harshit", 908723725)));
		
	   for(Item i: al)
	   {
		   System.out.println(i);
	   }
	   
	   System.out.println("---------------------------");
	   createMap(al);
	   
		
	}

}

