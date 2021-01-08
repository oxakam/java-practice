/**
 * Lecture 41: Thread Pools and the Executor Framework
 */
package threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2); //2 recycle threads in the pool

		Runnable processor = new MessageProcessor(2);
		executor.execute(processor);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);

		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);

		Runnable processor4 = new MessageProcessor(5);
		executor.execute(processor4);
		
		executor.shutdown();	//rejects any new tasks from being submitted
								//gracefully shuts down the service when all tasks are done
		
//		executor.shutdownNow();	//terminate the executor service immediately...
		
		
		//use awaitTermination instead of while loop below
		//it waits 10 seconds before moving to next line (choose any time)
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		while(!executor.isTerminated()) {
//			//continue to iterate over itself if executor is never terminated
//			//False when all tasks are done and then the loop finish
//		}		
		
		System.out.println("Submitted all tasks..."); //will be printed in the start if no while loop
	}

}
