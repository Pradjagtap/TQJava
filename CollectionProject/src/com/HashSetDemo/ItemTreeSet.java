//package com.HashSetDemo;
//
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.TreeSet;
//
//class ItemComparator implements Comparator(){
//	
//	
//@Override
//public int compare(Item o1, Item o2) {
//	if(o1.getCost()==o2.getCost())
//		return o1.getName().compareTo(o2.getName());
//	else
//		return (int)(o2.getCost()-o1.getCost());
//}
//}
//
//public class ItemTreeSet {
//
//	public static void main(String[] args) {
//		TreeSet<Item> ts= new TreeSet<ItemComparator>();
//		ts.add(new Item(1,"Chips",45));
//		ts.add(new Item(2,"Choco",90));
//		ts.add(new Item(3,"Biscuits",80));
//		ts.add(new Item(4,"Dips",190));
//		ts.add(new Item(5,"Chips",45));
//		
//		for(Item i:ts)
//		{
//			System.out.println(i);
//		}
//	}
//
//}
