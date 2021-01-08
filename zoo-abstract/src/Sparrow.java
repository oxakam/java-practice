//public class Sparrow extends Bird {

/* "implements" means implement interface Flyable 
    the class Sparrow must implement the inherited abstract method Flyable.fly
*/

public class Sparrow extends Bird implements Flyable {	
	
	public Sparrow(int age, String gender, int weightPounds) {
		super(age, gender, weightPounds);
	}

	//for any class that implements interface the interface wants the class   
	//to use this interface and implement that method
	
	public void fly() 
	{
		System.out.println("Sparrow flying high..."); 
	}
	
	//class can have many interfaces as it wants
}

