package app.prog;

public class Developer {
	String devName;
	double devExperience;
	String skills;
	
	Developer(){
		
	}
	Developer(String devName,double devExperience,String skills){
	this.devName=devName;
	this.devExperience=devExperience;
	this.skills=skills;
	}
	public void debugApp() {
		System.out.println("Debug is completed");
	}
	public void integrateApp() {
		System.out.println("Integrate app");
	}
	public void setdevName(String devName) {
		this.devName=devName;
	}
	public String getdevName() {
		return devName;
	}
	public double getDevExperience() {
		return devExperience;
	}
	public void setDevExperience(double devExperience) {
		this.devExperience = devExperience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String toString() {
		return "Name: "+devName+"Experience: "+devExperience+"Skills "+skills;
	}
	

}
