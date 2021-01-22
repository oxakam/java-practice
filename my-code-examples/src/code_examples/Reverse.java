package code_examples;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		//read string from input
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Write the string: "); 
        String initialString = scanner.nextLine();
        
        scanner.close();
        
        //split the string using space as delimiter
        String words[] = initialString.split(" ");	//or "\\s"
        
        reverseEachWord(words);
        
        reverseWordsInSentence(words);
 
        reverseEntireSentence(initialString);
	}
	
	static void reverseEachWord(String words[]) {
		
		 String reversedWords = "";
		 String word = "";		 
		
		 //loop for each word
	     for (int i = 0; i < words.length; i++) 
	     {
	        word = words[i];	        
	        String reversedWord = "";
	        
	        //reverse each word's position    
	        for (int j = word.length() - 1; j >= 0; j--) 
	        {	        	
	           reversedWord = reversedWord + word.charAt(j);
	        }
	        reversedWords = reversedWords + reversedWord + " ";
	     }
	     System.out.println("Reversed each word: " + reversedWords);		
	}

	static void reverseWordsInSentence(String words[]) {
		
		String reversedWords = "";
		
        for (int i = 0; i < words.length; i++) {
        	
        	//reverse each word's position
            if (i == words.length - 1) {
            	reversedWords = words[i] + reversedWords;
//            	System.out.println("(+)i=" +i+" "+ reversedWords); 
            }
            else {
            	reversedWords = " " + words[i] + reversedWords;
//            	System.out.println("(-)i=" +i+" "+ reversedWords);
            }
        } 
        System.out.println("Reversed words in sentence: " + reversedWords);
	}
	
	static void reverseEntireSentence(String initialString) {
		
		String reversedSentence = "";
		
		for (int i = initialString.length() - 1; i >= 0; i--) 
        {	        	
			reversedSentence = reversedSentence + initialString.charAt(i);
        }        
        System.out.println("Reversed entire sentence: " + reversedSentence);
	}
}
