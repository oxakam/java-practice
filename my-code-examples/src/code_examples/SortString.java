package code_examples;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortString {

	public static void main(String[] args) {
		
		//Scan the number of strings input
        Scanner scanner1 = new Scanner(System.in);
        
        //User is asked to enter the count of strings 
        System.out.print("Enter number of strings: ");
        
        int countLines = scanner1.nextInt();		
         
        String strArray[] = new String[countLines];
        
        //Scan the strings input 
        Scanner scanner2 = new Scanner(System.in);
         
        //User is entering the strings and they are stored in array
        System.out.println("Enter strings one by one:");
        
        for(int i = 0; i < countLines; i++)
        {
            strArray[i] = scanner2.nextLine();
        }       
         
        //Sorting the strings
        strArray = Stream.of(strArray)
        				 .sorted()
        				 .toArray(String[]::new);
         
        //Display strings sorted on alphabetical order
        System.out.println("Sorted order - toString: " + Arrays.toString(strArray)); 
        
        for(int i = 0; i < countLines; i++)
        {
        	System.out.println(strArray[i]);
        } 

        scanner1.close();
        scanner2.close();
	}	
}
