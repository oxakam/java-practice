import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		for(int i=0; i <= 3; i++) {
//			
//			Scanner input = new Scanner(System.in);
//	
//			System.out.println("Enter some text here: ");
//			
//			// Info the user enters will be captured by nextLine from Scanner
//			String enteredText = input.nextLine(); 
//		
//			System.out.println(enteredText); 
//		}
		
		try {
			File file = new File("myFile.txt");
			
			Scanner input;
			input = new Scanner(file);

			while (input.hasNextLine()) {
	
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} 
		catch (FileNotFoundException e) {			
			e.printStackTrace();	//Auto-generated catch block
		}
		
		MyFileUtils myUtil = new MyFileUtils();
		try {
			int res = myUtil.substract10FromLargerNumber(9);
			System.out.println(res);
		} 
		catch (Exception e) {	
			e.printStackTrace();
		}
 
	}
	
}
