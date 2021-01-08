package generics.client;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();	
		emp = acc;		//allowed (if it's a class) since accountant is extended employee (polymorphism) 
		
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
//		employees = accountants; 								//not allowed
		
		
		//Generic with Wildcards: 
		ArrayList<?> employees2 = new ArrayList<>();			//treated as Object with <?>
		ArrayList<String> accountants2 = new ArrayList<>();		//now no matter which type is here
		employees2 = accountants2;		 
		
		
		//Upper bound - means only children of Employee (or Employee) can be passed in this list
		//same as previous - accountant extended directly in assignment
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Employee> accountants3 = new ArrayList<Employee>();		
		employees3 = accountants3;		 

		
		//Lower bound
		//super means - data should be either Employee or a parent of Employee
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Object> accountants4 = new ArrayList<Object>();		
		employees4 = accountants4;		 
		
		
		makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
	}
	
//	public static void makeEmployeeWork(List<Employee> employees) {				//this doesn't works for makeEmployeeWork(accountants)
	public static void makeEmployeeWork(List<? extends Employee> employees) { 	//this works for makeEmployeeWork(accountants) also

		for(Employee emp : employees) {
			emp.work();
		}
	}

}
