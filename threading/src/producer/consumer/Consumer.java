package producer.consumer;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> questionList = null;
	
	//constructor
	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
/** producer adding questions to the list up to limit of 5 and wait until
	consumer removes the question from the questionList as a shared resource */
	
	public void answerQuestion() throws InterruptedException {
		
		synchronized(questionList) {	//shared resource questionList must be synchronized
			
			while(questionList.isEmpty()) {
				System.out.println("No more questions... Waiting for producer to get questions");
				
			 /* wait method belongs to Object class, which is common class for all objects
				wait for any other threads that will enter the share resource */
				
				questionList.wait();	//if you want to pass control to another block of code	
			}							//another thread is taking over
		}
		
		synchronized(questionList) {	 
			Thread.sleep(5000);
			
			System.out.println("ANSWERED questions: " + questionList.remove(0));			
			questionList.notify();		 
		}
	}
	
	@Override
	public void run() {		
		
		while(true) {			
			try {
				answerQuestion();
			} catch (InterruptedException e) { 
			}
		}
	}
}
