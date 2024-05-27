//package com.demo.objectpassing;
//
//import java.util.Scanner;
//
//import com.demo.containment.MyCollegeUserInput;
//import com.demo.objectpassing.Address.PersonInfo;
//
//class Address {
//	private String city;
//	private String state;
//	private String country;
//
//	Address() {
//
//	}
//
//	Address(String city, String state, String country) {
//		this.city = city;
//		this.state = state;
//		this.country = country;
//
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setCountry(String country) {
//		this.city = city;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public String toString() {
//		return "City: " + city + "State: " + state + "Country: " + country;
//
//	}
//
//	class Person {
//		private String name;
//		private String gender;
//		private double age;
//		Address address;
//
//		Person() {
//
//		}
//
//		Person(String name, String gender, double age, Address address) {
//			this.name = name;
//			this.gender = gender;
//			this.age = age;
//			this.address = address;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setGender(String gender) {
//			this.gender = gender;
//		}
//
//		public String getGender() {
//			return gender;
//		}
//
//		public void setAge(double age) {
//			this.age = age;
//		}
//
//		public double getAge() {
//			return age;
//		}
//
//		public void setAddress(Address address) {
//			this.address = address;
//		}
//
//		public Address getAddress() {
//			return address;
//		}
//
//		public String toString() {
//			return "Name: " + name + "Gender if person: " + gender + "Age: " + age + "Address: " + address;
//		}
//	}
//
//	public class PersonInfo {
//		Scanner sc = new Scanner(System.in);
//
//		public void enterDetails(Person p) {
//			System.out.println("Enter name: ");
//			p.setName(sc.next());
//			System.out.println("Enter gender: ");
//			p.setGender(sc.next());
//			System.out.println("Enter age: ");
//			p.setAge(sc.nextDouble());
//
//			p.setAddress(new Address());
//			System.out.println("Enter city: ");
//			p.getAddress().setCity(sc.next());
//			System.out.println("Enter state: ");
//			p.getAddress().setState(sc.next());
//			System.out.println("Enter country: ");
//			p.getAddress().setCountry(sc.next());
//
//		}
//	}
//
//	public static void main(String[] args) {
//		
//		
//		PersonInfo p1 = new PersonInfo();
//		
//		System.out.println(p1);
//
//	}
//}
