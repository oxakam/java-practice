package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHands;
	
	
	public Customer(String name, String address, double cashOnHands) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHands = cashOnHands;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHands() {
		return cashOnHands;
	}

	public void setCashOnHands(double cashOnHands) {
		this.cashOnHands = cashOnHands;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
	
		emp.handleCustomer(this, vehicle, finance);
	}

}
