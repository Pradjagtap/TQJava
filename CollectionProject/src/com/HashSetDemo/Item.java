package com.HashSetDemo;

import java.util.Objects;

public class Item {
	public int id;
	public String name;
	public double cost;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	//@Overridde
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Item other=(Item)obj;
		return Double.doubleToLongBits(cost)==Double.doubleToLongBits(other.cost)&& id==other.id
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
	
}
