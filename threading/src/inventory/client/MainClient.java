package inventory.client;

import jobready.inventory.InventoryManager;

public class MainClient {

	public static void main(String[] args) throws InterruptedException {

		InventoryManager manager = new InventoryManager();
		
		/** Two threads running simultaneously **/
		
		//Thread 1
		Thread inventoryTask = new Thread(new Runnable() {
			@Override
			public void run() {
				manager.populateSoldProducts();				
			}			
		});
		
		//Thread 2
		Thread displayTask = new Thread(new Runnable() {
			@Override
			public void run() {
				manager.displaySoldProducts();				
			}			
		});
		
		inventoryTask.start();
		Thread.sleep(2000);		//2 seconds interval

    /** the way of controlling the flow of threads:
		joining the main thread and wait until inventoryTask is completed */
//		inventoryTask.join();
		
		displayTask.start();
	}

}
