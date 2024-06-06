package com.demo.example2;

public class StudentConstructor {

	public static void main(String[] args) {		
		
		
		Student stud[]= new Student[4];
		
		stud[0]= new Student(101,"Amit",new double[] {67.5,78.9,89.5},new Course(1, "java"));
		stud[1]= new Student(102,"Neena",new double[] {70.5,85,90},new Course(2, ".net"));
//		double m3[]= {91,79,89};
//		stud[2]= new Student(103,"Manit",m3,new Course(1, "java"));
		stud[2]= new Student(103,"Manit",new double[] {91,79,89} ,new Course(1, "java"));
		
//		double m[]= {67.7,78.5};
//		double m[]= new double[] {67.6,90.4};
		
		stud[3]= new Student();
		stud[3].setId(104);
		stud[3].setName("Meera");
		stud[3].setMarks(new double[] {89.6,45.3,90.3});
		stud[3].setCourse(new Course(2, ".net"));

		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		stud[0].getCourse().setCname("FullStack");
		
		System.out.println("------------------------------------");
		
		for(Student s:stud)
		{
			System.out.println(s);
		}

	}

}