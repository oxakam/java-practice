/**
 * 56: Built-in Functional Interfaces
 * 
 *	see all Java functions here:
 *	https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */
package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		List<Car> cars = Arrays.asList(
				new Car("Honda","Accord","Red", 22300),
				new Car("Honda","Civic","Black", 20100),
				new Car("Toyota","Corolla","White", 20500),
				new Car("Jeep","Wrangler","Grey", 27300),
				new Car("Toyota","Camry","Red", 21900)
				);
		
//		Function <Car, String> priceAndColor = (c) -> {
//			return "Price = " + c.getPrice() + ", color = " + c.getColor();
//		};
		//it's just one line
		Function <Car, String> priceAndColor = (c) -> "Price = " + c.getPrice() + ", color = " + c.getColor();
		String stringCar = priceAndColor.apply(cars.get(0));
		
		System.out.println("stringCar: " + stringCar);
		
//		printCarsPriceRange(cars, 20000, 25000);
//		printCarByColor(cars, "Red");
		
		
//		printCars(cars, new carCondition() {	
//			
//			@Override
//			public boolean test(Car c) {				
//				return c.getPrice() >= 21000 && c.getPrice() <= 25000;
//			}
//		});
		
//		printCars(cars, new carCondition() {
//			
//			@Override
//			public boolean test(Car c) {				
//				return c.getColor().equals("Black");
//			}
//		});
		
		//lambda expressions (if one line - we don't need return statement)
		
		System.out.println("Cars between 21000 and 25000:");
		printCars(cars, (c) -> c.getPrice() >= 21000 && c.getPrice() <= 25000);
		
		System.out.println("Black Cars:");		
		printCars(cars, (c) -> c.getColor().equals("Black"));
		
	}

//	replace with Predicate (build-in) in printCars so interface Condition<T> is not used any more	
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c : cars) {
			if(predicate.test(c)) {
				c.printCar();
			}
		}
	}
	
//	public static void printCars(List<Car> cars, Condition<Car> condition) {
//		for(Car c : cars) {
//			if(condition.test(c)) {
//				c.printCar();
//			}
//		}
//	}
	
//	public static void printCarsPriceRange(List<Car> cars, int low, int high) {		
//		for(Car c : cars) {
//			if(low >= c.getPrice() && c.getPrice() <= high) {
//				c.printCar();
//			}
//		}
//	}
//
//	public static void printCarByColor(List<Car> cars, String color) {		
//		for(Car c : cars) {
//			if(c.getColor().equals(color)) {
//				c.printCar();
//			}
//		}
//	}
	
}

//@FunctionalInterface
//interface Condition<T> {		//make generic interface
//	public boolean test(T t);
//}

//interface carCondition {
//	public boolean test(Car c);
//}

