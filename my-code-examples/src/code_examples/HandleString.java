package code_examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class HandleString {

	private static final String LONGEST_WORD = "1 - Find the longest word";
	private static final String PERMUTE_STRING = "2 - Permute the string";
	private static final String DUPLICATE_WORDS = "3 - Find duplicate words";

	public static void main(String[] args) { 
		
	     //read function from user input
	     Scanner scanner = new Scanner(System.in);
			
	     System.out.println("Select the action: ");
	     System.out.println(LONGEST_WORD);
	     System.out.println(PERMUTE_STRING);
	     System.out.println(DUPLICATE_WORDS);
	     
	     String action = "";
	     
	     while (true) {						//do until action is correct
	    	action = scanner.nextLine();	//read user input 
	   
		     switch(action) {
			     case "1":			
				     System.out.print("Write set of words: ");
				     String setOfWords = scanner.nextLine();	
				     
				     longestWord(setOfWords);
				     
				     scanner.close();
				     break;
			       
			     case "2": 				
				     System.out.print("Write chars to permute: ");
				     String setOfChars = scanner.nextLine();	
				 
				     int len = setOfChars.length(); 
			    	 permute(setOfChars, 0, len - 1);
			    	 
			    	 scanner.close();
			    	 break; 
			 
			     case "3": 				
				     System.out.print("Write set of words: ");
				     String wordSet = scanner.nextLine();	
				 
				     findDuplicates(wordSet);
			    	 break; 
			    	 
			     default:
			    	 System.out.print("Type correct action !");
			    	 break;
		     }
		 }	     
	}
	
	private static void longestWord(String sentence) {
	    
		String[] senArray = sentence.split(" ");   //[^a-z^0-9]		
		int longestIndex = 0;		
		String longestWord = "";
		
		for (int i = 0; i < senArray.length; i++) {

			if (senArray[i].length() > longestIndex) {
				
				longestWord  = senArray[i];
				longestIndex = senArray[i].length();
			}
		}
		System.out.println("Longest word: " + longestWord);
	}
	
	//start & end index 
	private static void permute(String chars, int start, int end) 
    { 		
        if (start == end) 
            System.out.println(chars); 
        else
        { 
            for (int i = start; i <= end; i++) 
            { 
            	chars = swap(chars, start, i); 
                     permute(chars, start+1, end); 
                chars = swap(chars, start, i); 
            } 
        }
    }
	
	//i,j - position 1,2
	private static String swap(String chars, int i, int j) 
    { 
        char temp;        
        char[] charArray = chars.toCharArray();
        
        temp = charArray[i] ;        
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        
        return String.valueOf(charArray); 	//swapped string 
    }
	
	
	private static void findDuplicates(String text) 
    { 		
		List<String> listWords = Arrays.asList(text.split(" "));
		 
        Set<String> uniqueWords = new HashSet<String>(listWords);
        
        for (String word : uniqueWords) {
        	
        	//frequency - returns the number of elements 'word' in the collection 
            System.out.println(word + ": " + Collections.frequency(listWords, word));
        }
    }

}
