package com.demo.practice;

public class Demo {

		   static int x=1111;  
		   static {  
		      x=x-- - --x;   
		   }  
		   {  
		      x=x++ + ++x;  
		   }  
		   public static void main(String args[]) {  
		      System.out.println(x);  
		   }  
		}

