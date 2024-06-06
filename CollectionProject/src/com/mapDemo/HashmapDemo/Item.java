package com.mapDemo.HashmapDemo;

public class Item {
	private int id;
	private String iname;
	private double cost;
	private Supplier supplier;
	public Item(int id, String iname, double cost, Supplier supplier) {
		super();
		this.id = id;
		this.iname = iname;
		this.cost = cost;
		this.supplier = supplier;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
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
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", iname=" + iname + ", cost=" + cost + ", supplier=" + supplier + "]";
	}
	


}
