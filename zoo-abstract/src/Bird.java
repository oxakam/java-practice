
public class Bird extends Animal{

	public Bird(int age, String gender, int weightPounds) {
		super(age, gender, weightPounds);
	}

	@Override
	//abstract method from Animal added
	public void move() {
		System.out.println("Flapping wings...");
	}	

}
