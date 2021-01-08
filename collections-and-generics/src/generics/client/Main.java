package generics.client;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

//		ArrayList<String> myList = new ArrayList<String>();
//		myList.add("hello");
//		myList.add(12);
//		myList.add(true);
//		String myVal = (String) myList.get(0);
		
		//Generic
		Container<Integer, String> cont = new Container<>(10, "hey");	//can leave <> argument empty for new instance
		
		Container<Double, Integer> cont2 = new Container<>(17.00, 200);	//another instance of container
		
//		int val1 = cont.getItem1();
//		String val2 = cont.getItem2();	
		
		Set<String> set1 = new HashSet<String>();
			set1.add("first");
			set1.add("second");
			set1.add("house");
		
		Set<String> set2 = new HashSet<String>();
			set2.add("first");
			set2.add("second");
			set2.add("cat");
			
		Set<String> resultSet = union(set1,set2);
		
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		cont.printItems();
		cont2.printItems();
	}
	
	/* Generic method 'union'- we can use whatever types parms and use them inside the block
	 * E   - Elements
	 * T   - Types
	 * K,V - HashMaps (Key,Value)
	*/
	public static <E> Set<E> union (Set<E> set1, Set<E> set2) {		
		
		Set<E> result = new HashSet<>(set1);	
		
		result.addAll(set2);
		
		return result;	
	}

}
