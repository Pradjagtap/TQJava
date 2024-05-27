package com.demo.classobject;

public class Bank {
		
	private long accno;
	private String name;
	private double balance;
	
	public void setData(long accno,String name,double balance) {
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	
	}
	//setters or getters
	//setters - void with parameter
	//getters - return type(data type) without para no void
	
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public long getAccno() {
		return accno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public Double getBalance() {
		return balance;
		
	}
		
}
