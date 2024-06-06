package com.connect;

public class FirstThread1 extends Thread{
	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			String s=Thread.currentThread().getName();
			System.out.println("playing"+s+"game");
			try {
				Thread.sleep(3000,999999);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		FirstThread1 f=new FirstThread1();//new
		
		f.setName(" cricket ");
		
		f.start();//runnable
		
		FirstThread1 f1=new FirstThread1();
        f1.setName(" hockey ");
		
		f1.start();//runnable
		
		
	}

}
