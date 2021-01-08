package continue_package_2;

import java.util.HashSet;
//import java.util.LinkedHashSet;

public class HashSetApplication {

	public static void main(String[] args) {
	
		//HashSet ensures unique value and removes duplicates
		//HashSet doesn't care about order
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog",12);
		Animal animal2 = new Animal("Cat",3);
		Animal animal3 = new Animal("Bird",5);
		Animal animal4 = new Animal("Dog",12);
		Animal animal5 = new Animal("Zebra",2);
			
		animals.add(animal1);	
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
//		System.out.println(animal1.equals(animal4));	// it is False - HashSet cannot identify repeat here
		
		//To prevent duplicate objects in HashSet override default equals method:
		//Go to Animal class -> source -> Generate HashCode() and equals()... 	
		//because ONLY if the HashCode of two objects is the same, it prevents duplicates
		//even though the value is the same
		System.out.println(animal1.hashCode());
		System.out.println(animal4.hashCode());
		
		for(Animal txt : animals) {
			System.out.println(txt);
		}
	
//		HashSet<Integer> values = new HashSet<Integer>();		
//		values.add(12);		
//		values.add(43);
//		values.add(17);
//		values.add(50);		
//		values.add(43);		 
//		
//		for(Integer value : values) {
//			System.out.println(value);
//		}
//		
//		LinkedHashSet<String> texts = new LinkedHashSet<String>();
//		texts.add("Car");		 
//		texts.add("People");	
//		texts.add("Zoo");	
//		texts.add("Animal");	//LinkedHashSet prints in inserting order	
//		texts.add("Zoo");		//LinkedHashSet also removes duplicates
//		
//		for(String text : texts) {
//			System.out.println(text);
//		}
		
	}

}
