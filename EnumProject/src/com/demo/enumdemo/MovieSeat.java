package com.demo.enumdemo;

public enum MovieSeat {
	STANDARD(300),PREMIUM(450),RECLINER(600);
	
	int price;
	
	private MovieSeat(int price)
	{
		this.price=price;
	}

}
