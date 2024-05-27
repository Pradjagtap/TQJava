package com.demo.constructor;

public class Student {

	private int studid;
	private String studname;
	private double studmarks;
	
	public Student(int studid, String studname,double studmarks) {
		this.studid=studid;
		this.studname=studname;
		this.studmarks=studmarks;
	}
	public void setStudid(int studid) {
		this.studid=studid;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudname(String studname) {
		this.studname=studname;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudMarks(double studmarks) {
		this.studmarks=studmarks;
	}
	public Double getStudMarks() {
		return studmarks;
	}
	public String toString() {
		//return "hello";
		return "Student id: "+studid+" Student name: "+studname+" Student marks: "+studmarks;
	}
}
//ctrl+shift+t to see info of coding or extra study 
