package Evaluation;
//show example of hierarchical inheritance

class Vehicle
{
	String name;
	Vehicle(){
		
	}
	Vehicle(String name){
		this.name=name;
	}
	void show() {
		System.out.println("It is a vehicle");
	}
}
class Bike extends Vehicle
{
	int mileage;
	
	public Bike(String name) {
		super(name);
		
	}

	public Bike(int mileage,String name) {
		super();
		this.mileage = mileage;
	}
	void show() {
		System.out.println("It is a Vehicle type Bike ");
	}
	
}

class Car extends Vehicle
{
	int noOfWheels;

	public Car() {
		super();
		
	}

	public Car(String name) {
		super(name);
		
	}

	public Car(int mileage,String name,int noOfWheels) {
		super();
		this.noOfWheels = noOfWheels;
	}
	void show() {
		System.out.println("It is a Vehicle type car ");
	}
}

public class Second {
	
	public static void main (String[]args) {
		Vehicle v1=new Vehicle();
		v1.show();
		System.out.println(v1);
		
		Bike b1=new Bike(56,"Royal Enfield");
		b1.show();
		System.out.println(b1);
		
		Car c1=new Car(67,"Swift",4);
		c1.show();
		System.out.println();
		
	}
	
	

}
