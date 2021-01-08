package jobready.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	//Arrays, Lists, HashTable are not thread safe
	//because ArrayList.class is not synchronized (see in the class)
	
//	List<Product> soldProductList = new ArrayList<Product>();
	
	//use Thread safe collection CopyOnWriteArrayList:
	List<Product> soldProductList = new CopyOnWriteArrayList<Product>();
	List<Product> purchasedProductList = new ArrayList<Product>();
	
	public void populateSoldProducts() {
		
		for(int i=0; i<1000; i++) {
			Product prod = new Product(i, "product_"+i);
			soldProductList.add(prod);
			System.out.println("Added: "+prod);
			try {
				Thread.sleep(10); 	//just to demo how thread runs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		
		for(Product product : soldProductList) {
			System.out.println("Printing the sold: "+product);
			try {
				Thread.sleep(10); 	//just to demo how thread runs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
