package com.connect;

class Document implements Runnable
{
	Thread t;
Document()
{
	t=new Thread(this,"Document");
	t.start();
	t.interrupt();
	
}

@Override
public void run() {
	for(int i=1;i<=5;i++)
	{
		String s=Thread.currentThread().getName();
		if(i==3)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interupted exception handled");
			}
		}
		System.out.println(s+i+"printed");
	}
	
}
}

public class InterruptedMethod {
	

	public static void main(String[] args) {
		Runnable r=new Document();
		

	}

}

