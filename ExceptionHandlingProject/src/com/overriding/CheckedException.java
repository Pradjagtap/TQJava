package com.overriding;
class Parent
{
	
   int data=50;
   
   // not throwing any exception
   void printData()
   {
	   System.out.println(data);
   }

}

// child class : overriding: can throw unchecked exception

class Child extends Parent
{
	
   int val=0;
   
   void printData() throws ArithmeticException//,IOException 
   {
	   if(val==0)
          throw new ArithmeticException(); 
	   System.out.println(data/val);
	   
	  // throw new IOException();
   }

}

public class CheckedException {

}

