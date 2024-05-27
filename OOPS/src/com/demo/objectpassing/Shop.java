package com.demo.objectpassing;

public class Shop {
	private int itemid;
	private String itemname;
	private double cost;
	
	Shop(){
		
	}
	Shop(int itemid, String itemname,double cost){
		this.itemid=itemid;
		this.itemname=itemname;
		this.cost=cost;
	}
	
	public void setItemid(int itemid) {
		this.itemid=itemid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemname(String itemname) {
		this.itemname=itemname;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemcost(double cost) {
		this.cost=cost;
	}
	public double getItemcost() {
		return cost;
	}
	public String toString() {
		return "Item"+itemid+"name"+itemname+"cost"+cost;
		
	}
}
