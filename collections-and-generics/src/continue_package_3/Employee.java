package continue_package_3;

//public class Employee{

//any class that implements interface must comply with the contract 
//Comparable.class has method 'compareTo' and it must be added to object class (down here) 

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	String department;
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public int compareTo(Employee o) {

		if(this.salary < o.salary)
			return -1;
		else if (this.salary > o.salary)
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
}
