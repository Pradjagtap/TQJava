package com.treemapDemo;

public class Order {
	private int id;
	private String food;
	private int cost;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String food, int cost) {
		super();
		this.id = id;
		this.food = food;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", food=" + food + ", cost=" + cost + "]";
	}
	
}
