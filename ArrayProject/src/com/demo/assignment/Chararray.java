package com.demo.assignment;

public class Chararray {
	public static char charMin(char[] ch) {
		char min=ch[0];
		int cmin=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]<min) {
				min=ch[i];
				cmin=i;
			}
			
		}
		return min;
		
	}
	public static char charMax(char ch[]) {
		char max=ch[0];
		int cmax=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>max) {
				max=ch[i];
				cmax=i;
		
	}
		}
		return max;
	}
	public static void main(String[] args) {
		char arr[]= {'a','z','b','y'};
		
		System.out.println("Minimum: "+charMin(arr));
		System.out.println("Maximum: "+charMax(arr));
	}

}
