
public class Fish extends Animal {
	
	public Fish(int age, String gender, int weightPounds) {
		super(age, gender, weightPounds);
	}

	public void swim() {
		System.out.println("swimming...");
	}

	@Override
	//abstract method from Animal added
	public void move() {
		System.out.println("Fish is swimming...");
	}

}
