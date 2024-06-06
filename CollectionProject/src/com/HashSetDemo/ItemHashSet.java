package com.HashSetDemo;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		
		HashSet<Item> hs= new HashSet<>();
		hs.add(new Item(1,"Chips",45));
		hs.add(new Item(2,"Choco",45));
		hs.add(new Item(3,"Biscuits",45));
		hs.add(new Item(4,"Dips",45));
		hs.add(new Item(5,"Chips",45));
		
		for(Item i:hs)
		{
			System.out.println(i);
		}
		
		
		

	}

}
