package com.demo.practice;


public class Test8 
{
//		{
//		    public static void main(String[] args) 
//		    {
//		        System.out.println("Java" == new String("Java"));
//		       String s1="java";
//		        s1=s1.concat("concept");
//		       String s2="javaconcept";
//		       System.out.println(s1==s2);
//		       System.out.println(s1.equals(s2));
//		       System.out.println(s1.hashCode() == s2.hashCode());
//		    }
//		
//
//	}


    public static void main(String args[]) 
    { 
//        String str = "JavaProgramming"; 
//        String str1 = "Java"; 
//  
//        System.out.println(str.compareTo(str1)); 
//        System.out.println(str1.compareTo(str));
    	
    	double[] myList= {1,5,5,5,5,1};
    	double max=myList[0];
    	int indexOfMax=0;
    	for(int i=1;i<myList.length;i++)
    	{
    		if(myList[i]>max)
    		{
    			max=myList[i];
    			indexOfMax=i;
    		}
    	}
    	System.out.println(indexOfMax);
    } 
}

