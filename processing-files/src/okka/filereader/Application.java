package okka.filereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
	
		File file = new File("myFile.txt");
		
		//this in try block will be automatically closed by java itself so we don't need finally block
		//Explore FileReader -> it extends Reader(Closeable -> extends Autocloseable)
		//Closeable.class -> RM on Closeable interface (Ctrl+T) -> see all the classes implementing this interface
		//available from java 7 only
		
		try (FileReader fileReader = new FileReader(file); 
			 BufferedReader	buffReader = new BufferedReader(fileReader); )
		{			
			String line = buffReader.readLine();	//note: fileReader/buffReader ONLY accessible in try block!
				
			while(line != null) {
				System.out.println(line);
				line = buffReader.readLine();
			}				
		} catch (FileNotFoundException e) {		//for readLine method
			System.out.println("File not found");
				
		} catch (IOException e) {				//for readLine method 
			System.out.println("Problem reading the file" + file.getName());
				
		} 
	}
	
	
	// this solution was before: 
	
//		//define FileReader/BufferedReader outside the try block  
//		//because it is not seen in finally block to be closed 
//	
//		FileReader fileReader = null;
//		BufferedReader buffReader = null;
//		
//		try {
//			fileReader = new FileReader(file);
//			
//			//BufferedReader reads line by line
//			buffReader = new BufferedReader(fileReader);
//			
//			String line = buffReader.readLine();
//			
//			while(line != null) {
//				System.out.println(line);
//				line = buffReader.readLine();
//			}
//			
//		} catch (FileNotFoundException e) {		//for readLine method
//			System.out.println("File not found");
//			
//		} catch (IOException e) {				//for readLine method 
//			System.out.println("Problem reading the file" + file.getName());
//			
//		} finally {			//finally block is ALWAYS run - so we close file here			
//			try {
//				if(buffReader != null) {	//we use if!=null instead of NullPointerException
//					buffReader.close();
//				}
//				if(fileReader != null) {
//					buffReader.close();
//				}	
//				
//			} catch (IOException e) {
//				System.out.println("Unable to close file" + file.getName());
//			}				
////			  catch (NullPointerException ex) { 	
////				System.out.println("File was probably never opened " + ex);
////			}
//		}

}
