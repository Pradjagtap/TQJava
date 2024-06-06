package com.treemapDemo;

public class Customer {
	private int cid;
	private String name;
	private Long mobileno;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String name, Long mobileno) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileno = mobileno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	
}
