package com.HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
				
				HashSet<String> hs= new HashSet<>();
				hs.add("C++");
				hs.add("Angular");
				hs.add("Java");
				hs.add("Spring");
				System.out.println(hs.add("React"));
				hs.add(null);
				System.out.println(hs.add("React"));
				
				System.out.println(hs);
				System.out.println("-------------------------");
				
				for(String s:hs)
				{
					System.out.println(s);
				}
				
				System.out.println("-------------------------");
				
				Iterator<String> itr= hs.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
			}
		

}
