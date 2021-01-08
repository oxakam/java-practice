
public class Zoo {

	public static void main(String[] args) {
		
		//we cannot create new instance of abstract class
//		Animal animal1 = new Animal(7, "F", 34);
//		Animal animal2 = new Animal(3, "M", 15);		
//		animal1.sleep();
//		animal2.play();
		
		Bird bird1 = new Bird(7, "F", 25);
		Bird bird2 = new Bird(2, "M", 10);		
		bird1.play();
		bird2.sleep();
		
		Fish fish1 = new Fish(1, "F", 15);
		fish1.swim();
		
		//Chicken inherits all methods from Bird and Animal, but fly() is special for Chicken
		Chicken chick1 = new Chicken(2, "M", 5);
		chick1.sleep();
		
		Sparrow sparrow1 = new Sparrow(3, "F", 11);
		sparrow1.fly();
		sparrow1.move();
		
		Fish fish2 = new Fish(1, "M", 5);
		fish2.move();

		//===================================================
		//through Animal type specification we can invoke them move, but
		//the actual object's behavior, when application runs, will be different
		
		Animal sparrow = new Sparrow(4, "F", 13);
		sparrow.move();

		Animal fish = new Fish(4, "M", 13);
		fish.move();
		
		moveAnimal(sparrow);
		moveAnimal(fish);
		
		//===================================================
		
		Flyable flyingBird1 = new Sparrow(1, "F", 5);
		flyingBird1.fly(); 	//because Sparrow implemented Flyable
		
	}
	
	public static void moveAnimal(Animal animal) {	
		
		animal.move();
	}

}
