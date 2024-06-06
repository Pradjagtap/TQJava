package com.revision;

import java.util.Objects;


public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this.salary == obj.salary)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {

		if (o.salary == this.salary)
			
			return o.getName().compareTo(this.getName());
		else if (o.salary > this.salary)
			return 1;

		else
			return -1;

	}
}
//	if(e1.getSalary()==e2.getSalary())
//		return e1.getName().compareTo(e2.getName());
//		else
//			return (int)(e1.getSalary()-e2.getSalary());
//}
