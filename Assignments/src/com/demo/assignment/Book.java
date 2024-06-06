package com.demo.assignment;

//Task1: Create a class Book with the following details : id, name , price, category
//Create  methods to calDiscount(), compareDiscCost() 
//Create 4 objects of books by taking the user input and then compare the cost of any 2 books*/
class Book {
	private int id;
	private double price, discount;
	private String name, category;
	
	Book(){
		
	}

	Book(int id, String name, double price, String category,double discount) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.discount=discount;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}
	public void setDiscount(double discount) {
		this.discount=discount;
	}
	public double getDiscount() {
		return discount;
	}

	public double calDiscountedPrice(double discount) {
		discount = price - ((discount / 100) * price);
		return discount;
	}

	public void compareCost(Book obj) {
		if (this.discount == obj.discount)
			System.out.println("Both have same cost..");
		else if (this.discount > obj.discount)
			System.out.println(this.getName() + " has higher cost");
		else
			System.out.println(obj.getName() + " has higher cost");
	}

	public String toString() {
		return "Item:" + id + "Name " + name + "Price  " + price +"category "+category+" Discounted price: " + discount;
	}

}
