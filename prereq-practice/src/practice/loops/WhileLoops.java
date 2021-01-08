package practice.loops;

public class WhileLoops {

	public static void main(String[] args) {
		
		String str = "We have a large inventory of things in our warehouse falling in "
				   + "the category:apperal and the slightly more in demand " 
				   + "category:makeup along with the category:furniture and so on.";
		
		printCategories(str);				
	}
	
	//extract all categories from string argument	
	public static void printCategories(String str) {
		
		int i = 0;
		
		while(true) {							// always true until exit
			
			int found = str.indexOf("category:",i);
			
			if(found == -1) break;				//if not found -> exit
			
			int start = found + 9; 				//start of the actual category
			int end = str.indexOf(" ",start);	//end of the actual category
			
			System.out.println(str.substring(start, end));
			
			i = end + 1;
		}		
	}

}
