package com.vectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1=new Vector<>();
		v1.add(8);
		v1.add(5);
		v1.add(8);
		v1.add(-34);
		v1.add(23);
		
		System.out.println(v1);
		
		Enumeration<Integer> en=v1.elements();
		while(en.hasMoreElements()) {
			
			if(en.nextElement()==-34)
			v1.add(34);
		}
		System.out.println(v1);
		
	}

}
