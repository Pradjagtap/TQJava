package com.linkedHashmapAssign;

import java.util.LinkedHashMap;
import java.util.Map;
//9.	WAP to create a LinkedHashMap. Add 3 objects in it.
//6.	WAP to create a LinkedHashMap which contains Strings as key and objects of different classes as value.
//Print the map contents and observe the order.
class Item{
	private int id;
	private String iname;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String iname) {
		super();
		this.id = id;
		this.iname = iname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", iname=" + iname + "]";
	}
	
}
public class ItemTest {

	public static void main(String[] args) {
		Map<Item,String> i1=new LinkedHashMap<Item,String>();
		i1.put(new Item(101, "Apple"), "Mukesh");
		i1.put(new Item(103, "Banana"), "Akash");
		i1.put(new Item(104, "Mango"), "Sundar");
		//b.	WAP to get all keys in the Map.
		for(Map.Entry<Item, String> s:i1.entrySet()) {
			System.out.println(s.getKey()+"->"+s.getValue());
		}
		//a.	WAP to search a value in the Map.
	System.out.println(	i1.containsValue("Mukesh"));
	
	System.out.println("---------------------------");
	//c.	WAP to remove an element from the Map.
	System.out.println(	i1.remove(new Item(101, "Apple"), "Mukesh"));
	System.out.println(i1);
	

	}

}
