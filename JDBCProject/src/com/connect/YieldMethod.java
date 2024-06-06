package com.connect;

class ImpTask extends Thread
{
	public void run()
	{
		String s=Thread.currentThread().getName();
		System.out.println(s+" doing imp task");
		
		System.out.println(s+"Taking less time");
		
		
	}
}
class LessImpTask extends Thread
{
	public void run()
	{
		String s=Thread.currentThread().getName();
		Thread.yield();
		System.out.println(s+" doing less work");
		
		
		System.out.println(s+"Taking more time");
		
		
	}
}


public class YieldMethod {

	public static void main(String[] args) {
		ImpTask i=new ImpTask();
		i.setName("Imp thread");
		i.setPriority(8);
		i.start();
		
		LessImpTask l=new LessImpTask();
		l.setName("Less Imp thread");
		l.setPriority(2);
		l.start();
		
		
	}

}
