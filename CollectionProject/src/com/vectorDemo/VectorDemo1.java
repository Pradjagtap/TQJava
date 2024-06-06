package com.vectorDemo;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1=new Vector<>(3,10);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.add(90);
		v1.add(89);
		v1.add(56);
		
		System.out.println("-----------------");
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.add(80);
		System.out.println("---------------------");
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		System.out.println(v1);
		System.out.println("---------------");
		
		System.out.println(v1.get(2));
		System.out.println(v1.elementAt(2));//legacy
		
		System.out.println("---------------");
		
		System.out.println(v1.remove(1));
		v1.removeElementAt(1);//legacy
		
		System.out.println(v1);
		
		System.out.println("-------------");
		v1.set(1, 99);
		System.out.println(v1);
		
		v1.setElementAt(100, 1);
		System.out.println(v1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
