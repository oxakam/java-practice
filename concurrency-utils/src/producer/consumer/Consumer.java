package producer.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> questionQueue;
	
	//constructor
	public Consumer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}		
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
				System.out.println("ANSWERED question: "+ questionQueue.take());	//take removes from queue
			} catch (InterruptedException e) {
			}		
		}
	}

}
