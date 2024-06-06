

package com.linkedHashmapAssign;

import java.util.ArrayList;

public class Person {
	
//		ArrayList<String> al=new ArrayList<>();
//		al.add("Kiya");
//		al.add("Kiran");
//		al.add("Darshan");
//		for(String i: al)
//		   {
//			   System.out.println(i);
//		   }
	int id;
	String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
