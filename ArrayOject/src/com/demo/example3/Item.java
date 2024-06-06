package com.demo.example3;

public class Item {
	
	private int id;
	private String iname;
	private double cost;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String iname, double cost) {
		super();
		this.id = id;
		this.iname = iname;
		this.cost = cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", iname=" + iname + ", cost=" + cost + "]";
	}
	
	

}
