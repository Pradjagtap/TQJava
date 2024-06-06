package com.demo.assignment;

import java.util.Scanner;
public class Armstrong_number_1 {
	
	public static int countDigit(int num) {
		int sum=0,rem;
		int count=0;
		
		while(num!=0) {
				
			count++;
			num=num/10;
			}
		return count;
		
		}
	    		
		public static int findpower(int base,int pow) {
				int i;
				int p=1;
				for(i=1;i<=pow;i++) {
					p=p*base; 
				}
				return p;
		}

		
		public static boolean testArmstrong(int num) {
					int pow=countDigit(num);
					int original=num;
					int rem,sum=0;
					while(num!=0) {
						rem=num%10;
						sum=sum+findpower(rem,pow);//sum=sum+rem*rem*rem; //sum=sum+Math.pow(rem,pow)
						num=num/10;
					}
					return original==sum;
		}
					
		public static void Armstongnumber() {
				  int i;
				  for(i=1;i<=10000;i++) {
					  if(testArmstrong(i))
					System.out.println(i);
						
				  }
						
					}
		public static void main(String[] args) {
			Armstongnumber();
		
				
			
			
			
		}
		
	}


