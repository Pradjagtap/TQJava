package com.HashSetDemoAssign;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetHW {

	public static void main(String[] args) {
//1.WAP to convert a HashSet to an array.
		 Set<String> hashSet = new HashSet<>();
	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Cherry");
	        hashSet.add("Date");

	        String[] arr = new String[hashSet.size()];
	        int i = 0;
	        for (String element : hashSet) {
	            arr[i++] = element;
	        }
	        for (String n : arr) {
	            System.out.println(n);
	        }
		
		System.out.println("======================================================");
		
//2.WAP to remove all of the elements from a HashSet.		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Java");
		hs1.add("C++");
		hs1.add("SQL");
		hs1.add("HTML");

		System.out.println(hs1);
		hs1.clear();
	
		System.out.println(hs1);

		System.out.println("======================================================");
//3.WAP to add user defined objects of type Employee in a HashSet. Print the contents in the Set.

		Employee e1 = new Employee(1, "Pradnya", 20000.0);
        Employee e2 = new Employee(4, "Neha", 30000.0);
        Employee e3 = new Employee(3, "Suraj", 40000.0);
        Employee e4 = new Employee(2, "Raj", 50000.0);
        Employee e5 = new Employee(1, "Pradnya", 20000.0);

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e5);

        for (Employee e : employeeSet) {
            System.out.println(e);
        }
        
        System.out.println("======================================================");

 //4.WAP to add user defined objects of type Employee in a HashSet using duplicate Employee object   
 //5.	Print the contents in the Set.       
        Employee e11 = new Employee(1, "Abc", 2.0);
        Employee e12 = new Employee(4, "abc", 3.0);
        Employee e13 = new Employee(3, "XYZ", 4.0);
        Employee e14 = new Employee(2, "Mno", 5.0);
        Employee e15 = new Employee(1, "Abc", 2.0); 

        Set<Employee> employeeSet1 = new HashSet<>();
        employeeSet1.add(e11);
        employeeSet1.add(e12);
        employeeSet1.add(e13);
        employeeSet1.add(e14);
        employeeSet1.add(e15); 

        for (Employee emp : employeeSet1) {
            System.out.println(emp);
        }
        System.out.println("======================================================");
/*6.WAP to add user defined objects of type Employee which now implements Comparable interface ina 
 * HashSet. Print the contents in the Set. Add duplicate Employee object and print the contents in 
 * theSet.Observe the values  */
        
        System.out.println("Unique employee data in the set:");
        for (Employee e : employeeSet) {
            System.out.println(e);
        }
        
        System.out.println("======================================================");
/*8.WAP to retrieve and remove the highest element of a TreeSet using a single method call. 
 * Repeat the same using 2 different method calls.*/
      
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);

        Integer highestElement = treeSet.pollLast();

        if (highestElement != null) {
            System.out.println("Highest element removed: " + highestElement);
        } else {
            System.out.println("The set is empty.");
        }
        
        System.out.println("======================================================");
        Integer highestElement1 = treeSet.last();

        if (highestElement1 != null) {
            System.out.println("Highest element: " + highestElement1);

           
            boolean removed = treeSet.remove(highestElement1);
            if (removed) {
                System.out.println("Highest element removed successfully.");
            } else {
                System.out.println("Failed to remove the highest element.");
            }
        } else {
            System.out.println("The set is empty.");
        }
        
        System.out.println("======================================================");
        
  //9.	WAP to get the element in a TreeSet which is greater than or equal to the given element.
        Integer ceilingValue = treeSet.ceiling(30);

        if (ceilingValue != null) {
            System.out.println("Ceiling value for 25: " + ceilingValue);
        } else {
            System.out.println("No such element found.");
        }
	}
}