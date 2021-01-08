import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionApplication {

	public static void main(String[] args) {
		
		//ArrayList using array in the implementation. 
		//ArrayList is resizable array - default starting size is 10 slots 
		//if we create 11 slots, it creates new double array of 20 slots 
		//and copy all slots from old array to the new, if 21 -> creates 40 slots
		
		ArrayList<String> words = new ArrayList<String>();

		words.add("hello");		//objects in ArrayList
		words.add("there");
		words.add("5");

		for(String text : words) {
			System.out.println(text);
		}
		
		//LinkedList using node objects in the implementation 
		//It is faster to manipulate the data compare to ArrayList
		//but slower to retrieve the data then ArrayList
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(100);
		numbers.add(43);
		numbers.add(16);
		numbers.remove();	//if no index - removes first element (like removeFirst) 
		
		for(int num : numbers) {
			System.out.println(num);
		}	
		
		
		//LinkedList cannot contain primitive data type, only complex data types: 
		//Integer, Double, Float - that have Classes or Interfaces
		
//		LinkedList<int> numbers = new LinkedList<int>();	
		
//		String item1 = (String) words.get(0);	//force to convert to String
//		int item2 = (int) words.get(2);			//force to convert to int		
//		Object item2 = words.get(0);			//or we can just make it as Object

	}

}
