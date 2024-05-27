//package app.prog;
///*
//Write a program with ‘Application’ class in package app.prog containing properties like version, technology used, Developer and behaviors like install(),uninstall().                                                                                                 Developer class has properties, devName, devExperience,skills and methods debugApp(),integrateCode().                    
//Application class further used to create ‘DesktopApplication’ and ‘WebApplication’ classes in same package.              
//Application class is used to create ‘MobileApplication’ class in app.mob package.                           
//Do appropriate utilization of super keyword in creation of respective class objects and show details of each.
// */
//class Application1 {
//		double version;
//		String technology_used;
//		Developer developer;
//		
//		Application1(){
//			
//		}
//		Application1(double version,String technology_used,Developer developer){
//			this.version=version;
//			this.technology_used=technology_used;
//			this.developer=developer;
//		}
//		public void install() {
//			System.out.println("Installed");
//		}
//		public void uninstall() {
//			System.out.println("Uninstall");
//		}
//		public double getVersion() {
//			return version;
//		}
//		public void setVersion(double version) {
//			this.version = version;
//		}
//		public String getTechnology_used() {
//			return technology_used;
//		}
//		public void setTechnology_used(String technology_used) {
//			this.technology_used = technology_used;
//		}
//		public Developer getDeveloper() {
//			return developer;
//		}
//		public void setDeveloper(Developer developer) {
//			this.developer = developer;
//		}
//		public String toString() {
//			return " "+version+" "+technology_used+" "+developer;
//		}
//	}
//class DesktopApplication extends Application1{
//		
//		public void install() {
//			super.install();
//			System.out.println("Installed");
//		}
//		public void uninstall() {
//			super.uninstall();
//			System.out.println("Uninstall");
//		}
//	}
//public class Application{
//	public static void main(String[] args) {
//		Application p=new Application();
//		p.setDeveloper();
//	
//		
//	}
//	
//}
//
//
