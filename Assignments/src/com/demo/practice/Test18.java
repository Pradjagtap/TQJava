package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
	int age;
	String name;
	

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return (this.name.compareTo(o.name));
	}
	
}
public class Test18 {

	public static void main(String[] args) {
		ArrayList<Person> pl=new ArrayList<>();
		pl.add(new Person(45,"X"));
		pl.add(new Person(5,"NNN"));
		pl.add(new Person(5,"Y"));
		pl.add(new Person(5,"XAbc"));
		pl.add(new Person(35,"ZZZ"));
		
		Collections.sort(pl);
		System.out.println(pl);
	}

}
