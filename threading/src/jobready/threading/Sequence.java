package jobready.threading;

public class Sequence {

	private int value = 0;

	//locks the thread - synchronize running the code and
	//execute all inside the block before other thread starts
	
	public synchronized int getNext() {
		value++;
		return value;
	}
}

//same as here:
//	public int getNext() {
//		synchronized (this) {	
//			value++;
//			return value;
//		}
//	}