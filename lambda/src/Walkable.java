/**
 * Use annotation @FunctionalInterface for other developers
 * for not to add more abstract methods
 */

@FunctionalInterface
public interface Walkable {

/*  functional interface must have only ONE(!) abstract method
	to be used by lambda expression */
	
	public void walk();
}
