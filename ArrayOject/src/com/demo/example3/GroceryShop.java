package com.demo.example3;

public class GroceryShop {
	static void findSupplier(Supplier st[], String itemName)
	{
		System.out.println(itemName);
		for(Supplier s:st)
		{
			for(Item i:s.getItems())
			{
				if(i.getIname().equals(itemName))
				{
					System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMobileNo());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Supplier sups[]= new Supplier[3];
		
		Item i1[]= new Item[3];
		i1[0]= new Item(1, "Rice", 35);
		i1[1]= new Item(2, "Sugar", 25);
		i1[2]= new Item(3, "Flour", 75);
		
		sups[0]= new Supplier(1011, "Aakash",876453367, i1);
		
		Item i2[]= new Item[2];
		i2[0]= new Item(4,"Chocolates",35);
		i2[1]= new Item(5,"Chips",20);
		
		sups[1]= new Supplier(1022, "Ritu",985573782, i2);
		
		Item i3[]= new Item[2];
		i3[0]= new Item(6,"Chocolates",25);
		i3[1]= new Item(7,"Juice",120);
		
		sups[2]= new Supplier(1033, "Pradnya", 984422211,i3);
		
		
		
//		for(Supplier s: sups)
//		{
//			System.out.println(s);
//			
//			System.out.println("-----------------------------");
//		}
		
		for(Supplier s: sups)
		{
			System.out.println("Supplier:"+"Id-"+ s.getSid()+", Name-"+s.getSname()+", Mobile no-"+s.getMobileNo());
			for(Item i: s.getItems())
			{
				System.out.println(i);
			}
			
			System.out.println("-----------------------------");
		}
		
		System.out.println("====================================");
		
		findSupplier(sups, "Chocolates");
		
		
	}

}