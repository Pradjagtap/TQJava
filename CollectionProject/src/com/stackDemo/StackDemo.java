package com.stackDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stk=new Stack<>();
		stk.push("Pradnya");
		stk.push("Onkar");
		stk.push("Shreyash");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		System.out.println(stk);
		
		System.out.println(stk.pop());
		
		System.out.println(stk);
		
		System.out.println(stk.search("Onkar"));
		System.out.println("Harshit");//return -1
		
		
	}

}
