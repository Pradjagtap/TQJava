package com.demo.overriding;
/*
 Create a class Showroom having showroomid, showroomName
Create the showroom name as static and final and create a variable space as final
Initialize the final variable
Create a final method empRules() and create a class BikeShowRoom which inherits Showroom and try
to override empRules
 */



class Showroom1
{
     int showroomid;
	static String showroom_name="Tata";
	final int space=300;
	
	public Showroom1()
	{
		
	}
	public Showroom1(int showroomid) {
		this.showroomid=showroomid;
		
	}
	Showroom1 showDetails()
	{
		showroom_name="TQ";
		return this;
	}
	
	final void empRules() {
		System.out.println("Join on time");
	}
}
class BikeShowRoom extends Showroom1{
	String bike_type;
	
	BikeShowRoom(){
		
	}
	BikeShowRoom(int showroomid,String bike_type){
		super(showroomid);
		this.bike_type=bike_type;
	}
	BikeShowRoom showDetails()
	{
		showroom_name="TQ";
		return this;
	}
//	@Override
//	void empRules() {    //cant override because it is final
//		System.out.println("Join on time");
//	}
	
}
public class Showroom2 {

	public static void main(String[] args) {
		
		Showroom1 s;
		BikeShowRoom b;
		
		Showroom1 s1=new Showroom1(101);
		s=s1.showDetails();
		System.out.println(Showroom1.showroom_name);
		BikeShowRoom b1=new BikeShowRoom(102,"Honda");
		b=b1.showDetails();	
		System.out.println(Showroom1.showroom_name+b.showroomid);
		
		
		
		
				

	}

}
