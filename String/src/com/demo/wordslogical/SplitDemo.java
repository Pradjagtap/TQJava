package com.demo.wordslogical;

import java.util.Arrays;

public class SplitDemo {

	public static void main(String[] args) {
		
		String str="I like to learn Java";
		//String str="I like\t to learn \tJava";
		String[] s=str.split("\\s");//str.split("");
		
		System.out.println(Arrays.toString(s));
	}

}
