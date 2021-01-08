package code_examples;

public class SmallestSecondSmallest {	 
    
	 public static void main (String[] args) 
	 { 
	     int arr[] = {12, 13, 1, 10, 5, 1}; 
	     print2Smallest(arr); 
	 } 
	 
	 
	 static void print2Smallest(int arr[]) 
	    {
		/* Function to print first smallest and second smallest elements */
	    int first; 
	    int second;
	    int arr_size = arr.length;  
	    
	    /* There should be at least 2 elements */
	    if (arr_size < 2) 
	    { 
	        System.out.println(" Invalid Input "); 
	        return; 
	     } 
	    
	     first = second = Integer.MAX_VALUE;	//Integer.MAX_VALUE = 2147483647
	     
	     for (int i = 0; i < arr_size ; i ++) 
	     { 
	         /* If current element is smaller than first 
	            then update both first and second */
	         if (arr[i] < first) 
	         { 
	        	 second = first; 
	             first = arr[i]; 
	          } 	    
	          /* If arr[i] is in between first and second 
	             then update second  */
	          else if (arr[i] < second && arr[i] != first) 
	        	  second = arr[i]; 
	          } 
	          if (second == Integer.MAX_VALUE) 
	        	  System.out.println("There is no second" + 
	                                 "smallest element"); 
	          else
	              System.out.println("The smallest element is " + 
	                                 first + " and second smallest" + 
	                                 " element is " + second);  
	    }
	
}
