package jobready.threading;

public class MainSequence {

	public static void main(String[] args) {

		Sequence seq = new Sequence();
		
		Worker worker1 = new Worker(seq);
		worker1.start();
		
		Worker worker2 = new Worker(seq);
		worker2.start();
	}
}

class Worker extends Thread{
	
	Sequence seq = null;
 
	public Worker (Sequence seq) {		//constructor
		this.seq = seq;
	}
	
	public void run() {		//override run() from Runnable.class
		
		for(int i=0; i<100; i++) {
			
			System.out.println(Thread.currentThread().getName() + " got value: " + seq.getNext());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
