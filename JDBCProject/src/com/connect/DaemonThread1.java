package com.connect;

class DaemonMain1 extends Thread
{
	DaemonMain1()
	{
		System.out.println("hii");
	}
	
	public void run()
	{
		
		if(Thread.currentThread().isDaemon())
		{
			
		
		
			System.out.println("daemon");
		}
		else
		{
			System.out.println("normal user thread");
		}
		
	}
	
}

 class DaemonThread1 {

	public static void main(String[] args) {
		DaemonMain1 d=new DaemonMain1();
		d.setDaemon(true);
		
		d.start();

	}

}
