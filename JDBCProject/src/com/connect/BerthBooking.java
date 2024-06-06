package com.connect;

public class BerthBooking implements Runnable{
    int available=2;
	 int wanted;
	int count=0;
	BerthBooking(int wanted)
	{
		this.wanted=wanted;
	}
	
	
		
	



	@Override
	public  synchronized void run() {
		System.out.println("plz book ur berths");
		String s=Thread.currentThread().getName();
		
		if(available>=wanted)
		{
		System.out.println("Available berth"+available);
		System.out.println(" booking berth for"+s);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("congrats ur berth is booked");
		available=available-wanted;
		}
		else
		{
			System.out.println("sorry no berth available");
		count++;
		System.out.println("waiting no"+count);
		}
		}
		
	
	public static void main(String[] args) {
		BerthBooking b=new BerthBooking(1);
		
		Thread t1=new Thread(b,"first Person");
		t1.start();
		Thread t2=new Thread(b,"second Person");
		t2.start();

	}

}
