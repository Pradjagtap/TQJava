package com.demo;

public class StringMutable {

	public static void main(String[] args) {
		
		String s1="java";
		
		//when an string is returned then the object is created only in heap not in SCP
		
		s1.concat("Programs");//here a new String is created javaprograms
		
		System.out.println(s1);
		
		String s2="java";
		s2=s2.concat("Programs");//here object is created in heap which is then stored in scp
		
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		String s3="javaPrograms";
		System.out.println(s3.hashCode());
		System.out.println("--------------");
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		

	}

}
