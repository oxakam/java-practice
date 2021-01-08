package producer.consumer;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> questionList = new ArrayList<Integer>();
		
		//Two threads running simultaneously:
		//producer adding questions to the list up to limit of 5 and wait until
		//consumer removes the question from the questionList as a shared resource
		
		Thread t1 = new Thread(new Producer(questionList)); 
		Thread t2 = new Thread(new Consumer(questionList)); 
		
		t1.start();
		t2.start();		
	}
	
}
