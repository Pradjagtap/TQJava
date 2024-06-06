package com.demo.innerClass;

class Bank
{
	private static String bname="SBI Bank";
	String bankloc;
	String ifscCode;
	String aName;
	int accNo;
	
	{
		bankloc="Delhi";
		ifscCode="SBINDE1234";
	}
	Bank(){
		
	}
	Bank(int accno,String aName){
		this.accNo=accNo;
		this.aName=aName;
	}
	void displayBankDetails() {
		System.out.println(bname+" "+bankloc);
		System.out.println(ifscCode);
	}
	//Before JDK 1.8 we cannot have static variables and method in member inner clss
	
	class Locker
	{
		int lockerId;
		String pass;
		static float LockerRent=2000;
		
		Locker(){
			
		}
		public Locker(int lockerId,String pass) {
			super();
			this.lockerId=lockerId;
			this.pass=pass;
		}
		void displayLockerDetails() {
			displayBankDetails();
			System.out.println("This locker belongs to: "+aName+" with accNo"+accNo);
			System.out.println("Locker Id: "+lockerId);
			System.out.println("Rent to be paid: "+LockerRent);
		}
	}
}
public class BankDemo {

	public static void main(String[] args) {
		Bank cust1=new Bank(1011,"riya");
		Bank.Locker lock1=cust1.new Locker(10,"riya123");
		
		cust1.displayBankDetails();
		System.out.println("-------");
		lock1.displayLockerDetails();
		
		System.out.println("------");
		Bank.Locker lock2=new Bank(201,"Rahul").new Locker(12,"r123");
		lock2.displayLockerDetails();
	}

}
