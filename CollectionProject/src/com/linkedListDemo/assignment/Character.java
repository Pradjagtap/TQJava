package com.linkedListDemo.assignment;

public class Character {
	private int chracterId;
	private String chracterName;
	private String profile;
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Character(int chracterId, String chracterName, String profile) {
		super();
		this.chracterId = chracterId;
		this.chracterName = chracterName;
		this.profile = profile;
	}
	public int getChracterId() {
		return chracterId;
	}
	public void setChracterId(int chracterId) {
		this.chracterId = chracterId;
	}
	public String getChracterName() {
		return chracterName;
	}
	public void setChracterName(String chracterName) {
		this.chracterName = chracterName;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Character [chracterId=" + chracterId + ", chracterName=" + chracterName + ", profile=" + profile + "]";
	}
	
}
