package com.connect;

class Bake implements Runnable
{
	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		System.out.println("baking"+s);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadUsingRunnable {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread");
	Runnable r;
	r=new Bake();
   Thread t=new Thread(r,"Vanila cake");
   t.start();
   t.join();
   Thread t1=new Thread(r,"finished");
   t1.start();
   t1.join();
   
    
	

}

}
