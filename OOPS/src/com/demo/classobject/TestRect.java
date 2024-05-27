package com.demo.classobject;
//compilable
//we can't get public class at a time in one class 
class rectangle1 {
	//instance variable are which present inside theclass but outside th emethod 
	//it is called by object i.e instance
	double len;
	double br;
	
	public void color() {
		System.out.println("color instance method");
	}
}
//executable
public class TestRect{
	
	public static void main(String[] args) {
		rectangle1 r1=new rectangle1();//object
		
		r1.color();
		System.out.println(r1.len);
		System.out.println(r1.br);

	}

}

