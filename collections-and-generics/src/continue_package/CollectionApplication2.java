package continue_package;

import java.util.ArrayList;
import java.util.List;

public class CollectionApplication2 {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
//		for(int i = 0; i < animals.size(); i++) {		
//			System.out.println(animals.get(i));
//		}		
//		for(String a : animals) {		
//			System.out.println(a);
//		}
		
		printElements(animals);
//		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();	//array with size 10 if not other mentioned in ()
		List<Vehicle> vehicles2 = new ArrayList<Vehicle>();		//can also create a List
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		vehicles.add(new Vehicle("Toyota", "Camry", 12000, false));
		vehicles.add(new Vehicle("Jeep", "Wrangler", 23000, true));
		
//		for(Vehicle car : vehicles) {
//			//this prints like this: continue_package.Vehicle@7a81197d
//			//go: source -> generate to string
//			System.out.println(car);
//			
////			System.out.println(car.getMake());	//this prints make...
//		}
		
		printElements(vehicles);
	}
	
	//create a List super type, so it works for both ArrayList and LinkedList
	public static void printElements(List someList) {
		
		for(int i = 0; i < someList.size(); i++) {		
			System.out.println(someList.get(i));
		}
	}

}
