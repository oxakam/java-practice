package continue_package_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionApplication3 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);		 
		list1.add(34);
		list1.add(10);
		list1.add(43);
		list1.add(67);
		list1.add(10);

		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(67);
		
		//Other List methods:
		
//		list1.addAll(newList);					// merge 2 lists together - [12, 34, 10, 43, 67, 10, 67] 	
//		list1.removeAll(newList);				// removes newList elements from list1 - [12, 34, 43] 	
//		list1.retainAll(newList);				// delete all from list1 that is not in newList - [10, 67, 10]			
//		boolean hasValue = list1.contains(34);	// true - if list1 has value 34		
//		list1.clear();							// [] - clear list1	
//		boolean empty = list1.isEmpty();		// false - since list1 has values, true if clear() runs		
		
		//How to convert HashSet into a List
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);		 
		hashSet.add(34);
		hashSet.add(10);
		hashSet.add(43);
		
//		List<Integer> li = new ArrayList<Integer>(hashSet);	//how to populate to the list
		
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		
		//Sorting on array --------------------------------------
		Collections.sort(myList);	//cannot sort on hashSet, only on array
		
		//Sorting on String ---------------------------------------
		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Random");
		hashSet2.add("Star Wars");
		hashSet2.add("Car");
		hashSet2.add("Human");

		ArrayList<String> myList2 = new ArrayList<String>(hashSet2);
		
		//Sorting on array
		Collections.sort(myList2);	//cannot sort on hashSet, only on array
		
		//Sorting on own class object ----------------------------
		HashSet<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee("Mike", 2500, "Account"));
		emp.add(new Employee("John", 3500, "Customer"));
		emp.add(new Employee("Lisa", 2100, "Fee"));

		ArrayList<Employee> listEmp = new ArrayList<Employee>(emp);
		
		//link to sort function in Collections.class:
		//to sort on user defined object add 'implements Comparable<Employee>' to Employee class
		//and give sort criteria in compareTo method
		Collections.sort(listEmp);			
		
		System.out.println(listEmp);
	}

}
