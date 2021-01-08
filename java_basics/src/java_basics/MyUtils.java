package java_basics;

// public class called from other packages, class only within the same package
public class MyUtils {	
	
	public static String printSomeJunk (String arg) {
		return arg;
	}
	
	public static void printSomeJunk (int arg) {
		System.out.println("I am " + arg);
	}
	
	public static void sum2number (int arg1, int arg2) {
		System.out.println(arg1 + arg2);
	}

	public static int add10 (int argum) {
		int result = argum + 10;
		return result;				 
	}
	
//	not static	
	public int add100 (int argum) {
		int result = argum + 10;
		return result;				 
	}
}
