package com.connect;
//given by mam
public class FirstThread extends Thread{
	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			String s=Thread.currentThread().getName();
			System.out.println("playing"+s+"music");
			try {
				Thread.sleep(3000,9999999);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		FirstThread f=new FirstThread();//new
		
		f.setName("Jazz Music");
		
		f.start();//runnable
		
		FirstThread f1=new FirstThread();
        f1.setName("classical Music");
		
		f1.start();//runnable
		
		
	}

}
