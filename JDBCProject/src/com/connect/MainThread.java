package com.connect;

import java.lang.Thread.State;

public class MainThread {

	public static void main(String[] args) throws InterruptedException  {
		
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		t.setPriority(8);
		System.out.println(t.getPriority());
		System.out.println(t.getId());
		
		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(3000);
			}
		System.out.println("Main method Printing");
		}

	}


