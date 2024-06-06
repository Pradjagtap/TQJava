package com.demo.examples;

public class Studentarray {
	static void displayAllStudents(Student st[])
	{
		for(Student s:st)
			System.out.println(s);
	}
	
	static void sortMarks(Student st[]) {
		Student stemp=new Student();
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].getMarks()<st[j].getMarks())
				{
					stemp=st[i];
					st[i]=st[j];
					st[j]=stemp;
				}
			}
				
		}
	}


	public static void main(String[] args) {
		//Student s=new Student();
		Student stud[]=new Student[5];
		//System.out.println(stud[1].getName());
		//using constructors
		
		stud[0]=new Student(101,"Pradnya",89);
		//stud[1]=new Student();
		stud[1]=new Student(102,"Pradnya",79);
		stud[2]=new Student(103,"Pradnya",69);
		stud[3]=new Student(104,"Pradnya",59);
		stud[4]=new Student(105,"Pradnya",49);
		
		//System.out.println(stud[1].getName());
		System.out.println("-----");
		displayAllStudents(stud);
		
		sortMarks(stud);
		System.out.println("-----");
		displayAllStudents(stud);
	}

}
