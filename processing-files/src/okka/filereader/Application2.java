package okka.filereader;


class NewClass implements AutoCloseable{
	
	//how to create own AutoCloseable method
	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
	}	
}

public class Application2 {

	public static void main(String[] args) {
	
		try(NewClass var = new NewClass()){		//call new class inside the try condition
												//var is only accessible in try block
		} catch (Exception e) {		//because close() throws exception		
			e.printStackTrace();	//Auto-generated catch block
		}
	}

}
