package com.demo.classobject;
import java.util.Scanner;
public class Testperson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,age;
		String name;
		System.out.println("Enter personid: ");
		id=sc.nextInt();
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter age: ");
		age=sc.nextInt();		
		
		Person p=new Person();//object of our class
		p.setData(101,"priya",20);
		p.display();
		

	}

}
