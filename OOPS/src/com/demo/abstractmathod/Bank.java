//package com.demo.abstractmathod;
///*
// * Write a Java program to create an abstract class BankAccount with abstract methods deposit() 
//and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
//and implement the respective methods to handle deposits and withdrawals for each account type.
// */
//abstract class bank_account
//{
//	private int accno;
//	private String name;
//	private double balance;
//	private double total;
//	private double deposit;
//	private double withdraw;
//			
//	bank_account(int accno2, String name2, double balance2, double current_balance){
//		
//	}
//	bank_account(int accno,String name,double balance){
//		this.accno=accno;
//		this.name=name;
//		this.balance=balance;
//	}
//	public int getAccno() {
//		return accno;
//	}
//	public void setAccno(int accno) {
//		this.accno = accno;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	
//	abstract void deposit();
//	{
//		double total=0;
//	total=deposit+balance;
//	}
//		
//	
//	abstract void withdraw();
//	{
//	if(balance>withdraw) {
//		System.out.println("You can withdraw amount");
//		total=balance-withdraw;
//	}
//	else {
//		System.out.println("You can't withdraw");
//	}
//	}
//	
//	final void display() {
//		System.out.println("Account no: "+accno);
//		System.out.println("Name: "+name);
//		System.out.println("Balance: "+balance);
//		
//	}
//	
//}
//
//class Savingaccount extends bank_account
//{
//	private double save_balance;
//	double total;
//	
//	public Savingaccount() {
//		super();
//	}
//	public Savingaccount(int accno,String name,double balance,double save_balance) {
//		super(accno,name,balance);
//		this.save_balance=save_balance;
//		
//	}
//	void deposit() {
//		System.out.println("Check your account balance");
//		System.out.println("Total amount: "+total);
//	}
//	void withdraw() {
//		System.out.println("Check your account balance");
//		System.out.println("Total amount: "+total);
//	}
//}
//class Currentaccount extends bank_account
//{
//	private double current_balance;
//	double total;
//	
//	public Currentaccount() {
//		
//	}
//	public Currentaccount(int accno,String name,double balance,double current_balance) {
//		super(accno,name,balance,current_balance);
//		this.current_balance();
//	}
//	private void current_balance() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	void deposit() {
//		System.out.println("Check your account balance");
//		System.out.println("Total amount: "+total);
//		
//	}
//	@Override
//	void withdraw() {
//		System.out.println();
//		
//		
//	}
//	
//}
//public class Bank {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
