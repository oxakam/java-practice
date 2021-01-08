package jobready.inventory;

public class Product {
	int id;
	String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return("id: " + id + ", name: " + name);
	}
}
