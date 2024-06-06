package com.exceptionDemo2;

import java.io.IOException;

class Parent1
{
	
   int data=0;
   
   // throws unchecked exception
   
   void printData() throws ArithmeticException
   {
	   System.out.println(100/data);
   }

}

// child class : overriding: can throw unchecked exception
 //                         sub class of unchecked exception, any other exception
 // it cannot throw :  checked exception

class Child1 extends Parent1
{
	
   int val=0;
   
   void printData() throws RuntimeException, ArrayIndexOutOfBoundsException
   {
	   if(val==0)
          throw new ArithmeticException(); 
	   System.out.println(data/val);
	   
	  // throw new IOException();
   }

}

public class UncheckedException {

}
