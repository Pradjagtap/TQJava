package com.overriding;

import java.io.IOException;

import java.io.IOException;

class Parent2
{
	
   int data=50;
   
   // throws checked exception
   
   void printData() throws IOException
   {
	   System.out.println(data);
   }

}

// child class : overriding: can throw unchecked exception
 //                         
 // it can throw :  same checked exception, sub type
                      // not super type
//

class Child2 extends Parent2
{
	
   int val=10;
   
   void printData() throws ArithmeticException,IOException// Exception
   {
	   if(val==0)
          throw new ArithmeticException(); 
	   System.out.println(data/val);
	   
	  // throw new IOException();
   }

}

public class CheckedException2 {

}