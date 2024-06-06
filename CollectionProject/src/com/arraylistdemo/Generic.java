package com.arraylistdemo;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();//capacity 0
		list.add(12);
		list.add(78);
		list.add(90);
		list.add(13);
		
		System.out.println(list);
		
		System.out.println("-----------");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			int data=list.get(i)+10;
			list.set(i, data);
		}
		System.out.println("-----------");
		System.out.println(list);
	}

}
