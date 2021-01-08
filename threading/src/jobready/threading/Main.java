package jobready.threading;

public class Main {

	public static void main(String[] args) {

		System.out.println("start thread A");
		Thread t1 = new Thread(new Task("thread-A"));
		t1.start();			//instead of taskRunner.run();

		
		System.out.println("start thread B");
//		Thread t2 = new Thread(new Task("thread-B"));				
		Thread t2 = new Thread(new Runnable() {		//can also use anonymouse class like this:			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				// ...put body of run() here:
			}
		});
		t2.start();			//instead of taskRunner2.run();
	}
}

/** Note:
 * 		if we use: class Task 'implements Runnable' instead of 'extends Thread'
 * 		and taskRunner.run() -> it will not be multi thread running:
 * 		first runs thread A and then B,
 * 		so we need to make instance of Thread and use start() on it in main() method
 * */
//class Task extends Thread{
class Task implements Runnable{
	
	String name;					//give the Thread name 
	public Task (String name) {		//constructor
		this.name = name;
	}
	
	//we should have version of run() due to Thread implements Runnable
	public void run() {
		
		Thread.currentThread().setName(this.name);		//set the name of thread
		
		for (int i=0; i<100; i++) {
			System.out.println("i: "+ i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);	//sleep the thread - just to run slower
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

