package car_dealership;

public class Employee {

		public void handleCustomer(Customer cust, Vehicle vehicle, boolean finance) {
		
			if (finance == true) 
			{				
				double loanAmount = vehicle.getPrice() - cust.getCashOnHands();
				
				runCreditHistory(cust, loanAmount);
			}
			else if (vehicle.getPrice() <= cust.getCashOnHands()){
				
				processTransaction(cust, vehicle);	//customer pays in cash
			}
			else {
				System.out.println("Customer needs more money for " + vehicle);
			}
		}		
		
		public void runCreditHistory(Customer cust, double loanAmount) {
			
			System.out.println("Run credit history for customer");
			System.out.println("Customer has been approved to puchase the vehicle");
		}
		
		public void processTransaction(Customer cust, Vehicle vehicle) {
			
			System.out.println("Customer has puchased the vehicle " 
								+ vehicle + " for the price " + vehicle.getPrice());
		}
}
