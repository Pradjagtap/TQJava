package com.demo.StringLogical;

public class StringIntern {

	public static void main(String[] args) {
		//string intern is used save memory
		//by using intern if we create object and it return value then this was going to heap not scp
		//after using intern it will directly goes to scp
		//in that way it saves memory
		
		String s1="java";
		String s2="java";
		
		//compare reference to object
		System.out.println(s1==s2);
		
		//compares content
		System.out.println(s1.equals(s2));
		
		System.out.println("-----------");
		
		String s3=new String("java");//points to heap
		s3=s3.intern();
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String str2="java";
		str2=str2.concat("programs");//here object is created in heap which is then stored in 
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		String str3="javaprograms";
		System.out.println(str3.hashCode());
		System.out.println("--------------");
		
		str2=str2.intern();
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		

	}

}
