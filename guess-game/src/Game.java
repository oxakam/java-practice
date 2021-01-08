import java.util.Random;

public class Game {

	private int randomNumber;
	
	public Game() {		
		//set randomNumber to random number [1-10]
		Random rand = new Random();
		randomNumber = rand.nextInt(10) + 1; //0-10	
	}
	
	public int getRandomNumber() {
		return randomNumber;
	}
}
