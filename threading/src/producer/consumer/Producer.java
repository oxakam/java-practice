package producer.consumer;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNo;
	
	//constructor
	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	//producer adding questions to the list up to limit of 5 and wait until
	//consumer removes the question from the questionList as a shared resource
	
	public void readQuestion(int questionNo) throws InterruptedException {
		
		synchronized(questionList) {	//shared resource questionList must be synchronized
			
			while(questionList.size() == LIMIT) {
				System.out.println("Wait for questions...");
				
				//wait method belongs to Object class, which is common class for all objects
				//wait for any other threads that will enter the share resource 
				questionList.wait();	//if you want to pass control to another block of code	
			}							//another thread is taking over
		}
		
		synchronized(questionList) {	//shared resource questionList must be synchronized
			
			System.out.println("New question: " + questionNo);			
			questionList.add(questionNo);
			Thread.sleep(1000);
			
			//notify the threads that are waiting that question has been added to questionList
			questionList.notify();		//wait and notify used only inside synchronized block
		}
	}
	
	@Override
	public void run() {		
		
		while(true) {			
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) { 
			}
		}
	}
}
