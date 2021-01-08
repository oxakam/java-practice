package producer.consumer;

import java.util.concurrent.BlockingQueue;

public class Producer  implements Runnable {
	
	private int questionNo;
	
	BlockingQueue<Integer> questionQueue;
	
	//constructor
	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}
		
	@Override
	public void run() {
		
		while(true) {
			try {
				//use synchronized(this) to make Producer thread 100% safe
				synchronized(this) {	
					int nextQuestion = questionNo++;
					System.out.println("Got new question: "+ nextQuestion);				
					questionQueue.put(nextQuestion);				
				}
			} 
			catch (InterruptedException e) {
			}	
		}
	}

}
