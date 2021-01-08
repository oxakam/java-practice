package okka.exceptions;

	//build own exception with constructor passing string

	public class MyRuntimeException extends Exception {
		 
		public MyRuntimeException (String message) {
			super(message);
		}		
	}