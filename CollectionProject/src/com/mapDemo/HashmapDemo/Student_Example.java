package com.mapDemo.HashmapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student_Example {

	public static void main(String[] args) {
				
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Puja",84.5f));
		al.add(new Student(1,"Alfiya",85.7f));
		al.add(new Student(1,"Raj",29.7f));
		al.add(new Student(1,"Dipak",34.7f));
		
		for(Student s:al)
		{
			System.out.println(s);
		}
		HashMap<String,String> hm=new HashMap<>();
		Iterator<Student>itr=al.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			if(s.getPer()>35)
			{
				hm.put(s.getName(),"Pass");
			}
			else
			{
				hm.put(s.getName(), "Fail");
			}
			
		}
		System.out.println(hm);
		System.out.println("-----------------");
//		for(Map.Entry<String,String>e:hm.entrySet())
//		{
//			System.out.println(e.getKey()+"-->"+e.getValue());
//		}
	}

}
