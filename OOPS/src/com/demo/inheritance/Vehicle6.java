package com.demo.inheritance;
import java.util.Scanner;
class vehicle5
{
	int vno;
	String vname;
	String vtype;
	int vcap;
	
	vehicle5(){
		
	}
	vehicle5(int vno, String vname,String vtype,int vcap){
		this.vno=vno;
		this.vname=vname;
		this.vtype=vtype;
		this.vcap=vcap;
	}
	
	
	
}
class car1 extends vehicle5{
	String brand;
	String model;
	String color;
	
	car1(){
		
	}
	car1(int vno, String vname,String vtype,int vcap, String brand, String model,String color){
		super(vno,vname,vtype,vcap);
		this.brand=brand;
		this.model=model;
		this.color=color;
	}
}
public class Vehicle6 {
	

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		vehicle5 v=new vehicle5(1233,"Suzuki","Baleno",5);
		car1 c=new car1(1233,"Suzuki","Baleno",5,"fjfj","fjhj","White");
		System.out.println("Vehicle no: "+v.vno);
		System.out.println("Vehicle name: "+v.vname);
		System.out.println("Vehicle type: "+v.vtype);
		System.out.println("Vehicle person capacity: "+v.vcap);
		System.out.println("Car brand: "+c.brand);
		System.out.println("Car model: "+c.model);
		System.out.println("Car color: "+c.color);
		
		
		
	}
}