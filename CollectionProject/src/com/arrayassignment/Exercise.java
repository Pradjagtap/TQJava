package com.arrayassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise {

	// 2. Now override toString for earlier assignment and now sysout and see
	// values are printed
	// 3. WAP to print Emp whose salary is > 10000
	// 4. WAP to print Emp who have name "Sachin"
	// 5. WAP to print Emp who have highest number of salary
	// 7. WAP to sort a given ArrayList
	public static void main(String[] args) {
		List<Employee1> elist = new ArrayList<>();

		elist.add(new Employee1(101, "Anita", 15000));
		elist.add(new Employee1(103, "Amruta", 25000));
		elist.add(new Employee1(104, "Pradnya", 18000));
		elist.add(new Employee1(105, "Sachin", 19000));
		elist.add(new Employee1(102, "Jiya", 10000));
		elist.add(new Employee1(107, "Neha", 26000));
		System.out.println(elist);

		System.out.println("-------------------------------");
		for (Employee1 e : elist) {
			System.out.println(e);
		}
		System.out.println("-------------------------------");
		for (Employee1 e : elist) {
			if (e.getSalary() > 10000)
				System.out.println(e);
		}

		System.out.println("-------------------------------");
		for (Employee1 e : elist) {
			if (e.getName() == "Sachin")
				System.out.println(e);
		}

		System.out.println("-------------------------------");

		double max = elist.get(0).getSalary();
		for (int i = 0; i < elist.size(); i++) {
			if (elist.get(i).getSalary() > max) {
				max = elist.get(i).getSalary();
			}
		}
		System.out.println(max);

		System.out.println("-------------------------");
		Collections.sort(elist);
		for (Employee1 e : elist) {
			System.out.println(e);
		}

		// 8. WAP to copy one ArrayList into another
		System.out.println("-------------------------");

		ArrayList<Employee1> emp1 = new ArrayList<>();
		emp1.addAll(elist);
		// System.out.println(emp1);
		for (Employee1 e : emp1) {
			System.out.println(e);
		}

		// 10. WAP to join two ArrayLists
		System.out.println("-------------------------");
		ArrayList<Employee1> emp2 = new ArrayList<>();
		emp2.add(new Employee1(1021, "Sham", 15000));
		emp2.add(new Employee1(1031, "Raj", 25000));

		emp1.addAll(emp2);
		System.out.println(emp1);

		// 13. WAP to trim the capacity of an ArrayList the current list size
		System.out.println("-------------------------");
		System.out.println(elist.size());
		emp1.trimToSize();
		System.out.println(elist.size());

		// 17. WAP to shuffle elements in an ArrayList
		System.out.println("-------------------------");
		Collections.shuffle(elist);
		System.out.println(elist);

		// 18. WAP to reverse elements in an ArrayList
		System.out.println("-------------------------");
		Collections.reverse(elist);
		System.out.println(elist);

		// 19. WAP to extract a portion of an ArrayList
		System.out.println("-------------------------");
		System.out.println(elist.subList(1, 3));

		for (Employee1 e : emp1) {
			System.out.println(e);
		}

		System.out.println("-------------------------");
		for (Employee1 e : elist) {
			System.out.println(e);
		}
		// 20. WAP to print all the elements of an ArrayList using the position of the
		// elements
		System.out.println("-------------------------");
		for (int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i));
		}
	}

}
