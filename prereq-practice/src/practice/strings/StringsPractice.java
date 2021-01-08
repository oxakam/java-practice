package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {

		String a = "hello";	
		String b = "there";	
		
		if (a.equals("hello")) {
			//use this compare (or !a.equals), not a==""
		}
		if (b.equalsIgnoreCase("TheRe")) {		//ignore case sensitive
			System.out.println("print there");
		}
		
		System.out.println(a.charAt(2));	//char at position 2
	
		//===================================
		String str = "hello over there over";
		
		int x  = str.indexOf("over");		//find start position of 'over' - searching from left to right 
		System.out.println(x);
		
		int xx = str.indexOf("o",2);		//position to start searching from (-1 means 'not found')
		System.out.println(xx);
		
		int xxx = str.lastIndexOf("over");	//position of last char of 'over' - searching from right to left 
		System.out.println(xxx);
		
		//===================================
		char ch1 = 'a';  
		char ch2 = '9';
		
		int in = ch1;  
		int ix = ch2;
		
		System.out.println(ch1 + " = " + in);
		System.out.println(ch2 + " = " + ix);
	}

}
