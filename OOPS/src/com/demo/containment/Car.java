package com.demo.containment;
/*Create a class Car having carNo, brand, model
every Car is alloted a Driver having driverid, name, adharNo, salary
We have a Taxi system , Create class where each Car is alloted one driver 
  > Create an anoymous driver which is been alloted to a car for just one day
  > Create 3 car having a driver each (taking user input)
Print the details of car along with the driver*/

public class Car {
	private int carno;
	private String brand;
	private String model;
	private Driver driver;
	
	public Car(){		
	
	}
	public Car(int carno, String brand, String model,Driver driver) {
		this.carno=carno;
		this.brand=brand;
		this.model=model;
		this.driver=driver;
	}
	public void setCarno(int carno) {
		this.carno=carno;
	}
	public int getCarno() {
		return carno;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setDriver(Driver driver) {
		this.driver=driver;
	}
	public Driver getDriver() {
		return driver;
	}
	public String toString() {
		return carno+" "+brand+" "+model+" "+driver+" ";
		
		
	
		
	}

}
