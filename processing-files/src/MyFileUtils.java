
import okka.exceptions.MyRuntimeException;

public class MyFileUtils {
	
//	public int substract10FromLargerNumber(int num) throws Exception {
//		
//		if(num < 10) {			
//			throw new Exception("small number");
//		}
//		return num - 10;
//	}

	//use own exception MyRuntimeException which extends Exception class in okka.exceptions package 
	//better to create own package for own exception to avoid conflict with java exceptions library
	
	public int substract10FromLargerNumber(int num) throws MyRuntimeException {
		
		if(num < 10) {			
			throw new MyRuntimeException("It's a small number");
		}
		return num - 10;
	}
	
}
