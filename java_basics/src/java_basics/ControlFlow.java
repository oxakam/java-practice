package java_basics;

public class ControlFlow {

	public static void main(String[] args) {

		boolean hungry = true;
		
		if (hungry) {
			System.out.println("i'm starving...");
		}
		else {
			System.out.println("i'm hungry");
		}

		int favoriteTemp = 75;
		int currentTemp = 75;
		String opinion;
		
		if (currentTemp == favoriteTemp) {
			
			if (currentTemp < favoriteTemp - 30) {
				opinion = "its darn cold";
			}
			else if (currentTemp < favoriteTemp - 20) {
				opinion = "its kinda cold";
			}
			else if (currentTemp > favoriteTemp + 10) {
				opinion = "its hot";
			}
			else {
				opinion = "its beautiful day";
			}
		}else {
			opinion = "unknown temp";
		}
		System.out.println(opinion);
		
		
		int month = 3;
		String strMonth;
		
		switch(month) {
			case 1: strMonth = "January";
				break;
			case 2: strMonth = "February";
				break;
			case 3: strMonth = "March";
				break;
			case 4: strMonth = "April";
				break;
			default: strMonth = "unknown";
				break;
		}
	}
	

}
