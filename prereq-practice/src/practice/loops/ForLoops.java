package practice.loops;

public class ForLoops {
	
	public static void main(String[] args) {
		
		String name = "sdfghjkiuy";
		
		for (int i=0; i < name.length(); i++) {
			
			System.out.println("char: " + name.charAt(i));
		}		
		System.out.println("-----------");
		
		//backwards
		for (int i=name.length()-1; i >= 0; i--) {

			System.out.println("char: " + name.charAt(i));
		}	
		System.out.println("-----------");

		//even numbers
		for (int i=0; i <= 20; i+=2) {
					
			System.out.println(i);
		}
	}

}
