package java_basics;

public class Arrays {

	public static void main(String[] args) {		// entry point for all java apps

		double [] values = new double [100];		//array with 100 slots - stored 100 elements
													//double treats all int as decimal
		values[0]= 1000;
		values[1] = 445.88;							//we cannot use decimal if array is int
		values[99]= 3423;	
		System.out.println(values[99]);
		
		
		//another string syntax
		String [] words = new String[] {"my","name","is"};	//String [] words = new String [3];		
		System.out.println(words[2]);
		
		
		words = new String[10];
		System.out.println(words[0]);
		
	}
}
