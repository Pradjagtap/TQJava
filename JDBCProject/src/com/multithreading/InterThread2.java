package com.multithreading;

import java.util.Scanner;

class Writting {
	synchronized void write(String author) throws InterruptedException {
		System.out.println("Author name:" + author);
		Thread.sleep(4000);
		System.out.println("my writting work has done");
		notifyAll();
	}

	synchronized void read() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Author extends Thread {
	Writting w;
	String author="Vishwas";
	Author(Writting w) {
		this.w = w;
		this.start();
	}

	public void run() {
		try {
			w.write(author);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Reader1 extends Thread {
	Writting w;

	Reader1(Writting w) {
		this.w = w;
		this.start();
	}

	public void run() {
		w.read();
		System.out.println("Reader1 stared reading");
	}
}

class Reader2 extends Thread {
	Writting w;

	Reader2(Writting w) {
		this.w = w;
		this.start();
	}

	public void run() {
		w.read();
		System.out.println("Reader1 stared reading");
	}
}

public class InterThread2 {

	public static void main(String[] args) {
		Writting w=new Writting();
		
		Reader1 p1=new Reader1(w);
		Reader2 p2=new Reader2(w);
		
		Author a=new Author(w);
		
		
		
		

	}

}
