/**
 * 24: PRACTICAL PROJECT: Car dealership
 */
package car_dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cust = new Customer("Tom", "Any Sreet 12", 12000);
		
		Vehicle vehicle = new Vehicle("KIA", "Ceed", 11000);

		Employee emp = new Employee();

		cust.purchaseCar(vehicle, emp, false);

		
		// equals method		
		Vehicle car = new Vehicle("KIA", "Ceed", 11000);
	
		//since all classes are children of object, they inherit from Object.class
		//this equal method from Object.class gives false for exact same objects
		
		boolean value = car.equals(vehicle);
		
		System.out.println(value);
		//so what we need to do is to override the equals method from Object.class in Vehicle class 
		
		
		/**
		 * Scenario:
		 * 
		 * handleCustomer( Customer cust, Vehicle vehicle, boolean finance ); 
		 * if(finance == true) 
		 * 		runCreditHistory(Customer cust, double amount) 
		 * else if (vehicle.getPrice() <= cust.getCashOnHand() ) 
		 * 		processTransaction(Customer cust, Vehicle vehicle) 
		 * else tell customer to bring more money;
		 */

	}

}
