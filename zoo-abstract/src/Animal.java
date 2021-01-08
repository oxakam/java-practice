
//child classes, that extend Animal class (Bird, Fish), need to implement abstract method move(); 
public abstract class Animal {
	
	int age;
	String gender;
	int weightPounds;
	
	public Animal(int age, String gender, int weightPounds) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightPounds = weightPounds;
	}

	public void sleep() {
		System.out.println("is sleeping");
	}
	
	public void play() {
		System.out.println("is playing");
	}	

	//abstract class is almost like a regular class except that it has 
	//abstract methods in it and abstract class can only be extended 
	//you cannot instantiate an instant of an abstract class
	//it's only meant to be a parent of another class
	
	public abstract void move();
		
	//abstract class has no body so we add abstract here to the void
	//and than to the Animal class definition
	
	//this allows for abstracting away the idea that an animal moves
	//differently than another
	//so we would never really create the instance of abstract class Animal
	//abstract class is used for inheritance - this is usually a parent class
	//and expects child classes to implement the abstract methods.
	
}
