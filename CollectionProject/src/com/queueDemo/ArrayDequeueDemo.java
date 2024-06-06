package com.queueDemo;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		//def cap-16
		//increase by power of 2
		//maintains the insertion order
		
		ArrayDeque<Book> adq=new ArrayDeque<>();
		adq.add(new Book(1,"Secret",900));
		adq.add(new Book(1,"Hamlet",750));
		adq.add(new Book(1,"Life",1000));
		adq.add(new Book(1,"Powe of mind",820));
		//addLast() explicitly throws null pointer exception while overriding this method
		
		//adq.add(null)
		
		for(Book b:adq)
		{
			System.out.println(b);
		}
		System.out.println("--------------");
		System.out.println(adq.removeLast());
		
		System.out.println("----------------");
		for(Book b:adq)
		{
			System.out.println(b);
		}
		System.out.println("-----------------");
		System.out.println(adq.getFirst());
		for(Book b:adq)
		{
			System.out.println(b);
		}
	}

}
