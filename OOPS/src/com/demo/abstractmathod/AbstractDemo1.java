package com.demo.abstractmathod;

abstract class Language
{
	//can have both abstract and concrete methods
	abstract void details();
	void show()
	{
		System.out.println("Languages");
	}
}
class ProLanguage extends Language
{
	@Override
	void details() {
		System.out.println("C++,Java,Net,Python");
	}
	void display(String name)
	{
		System.out.println("Institute: "+name);
	}
}
class SpeakingLanguage extends Language
{
	@Override
	void details() {
		System.out.println("English,French,Spanish");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		// we cannot create object of abstract class
		//Language 1=new Language();
		
		Language lang;
		lang=new ProLanguage();
		lang.details();
		lang.show();
		//lang.display();
		
		lang=new SpeakingLanguage();
		lang.details();
		
		
	}

}
