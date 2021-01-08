package code_examples;

import java.util.Arrays;

public class HandleArrays {

	public static void main(String[] args) {		
		//Find intersection and union of two arrays 
		int a[] = { 1, 3, 2, 3, 4, 5, 5, 6, 10 };
		int b[] = { 3, 5, 9, 2, 11, 1 };
		 
		int n = a.length;
		int m = b.length;

		getArrayIntersection(a, b, n, m);
		      
			System.out.println();
		        
		getArrayUnion(a, b, n, m);
		
			System.out.println("Sum of two:");
		
		getSumOfTwo(a, 7);        
		        
			System.out.println();
		        
		getMiddleNumber(100, 45, 8);		        
	}
    
	static void getArrayIntersection (int arr1[], int arr2[], int n, int m)
    {
        int i = 0; 
        int j = 0;
      
        Arrays.sort(arr1);		//sort using java.util
        Arrays.sort(arr2);
        
        while (i < n && j < m) {
 
            if (arr1[i] > arr2[j]) {	
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else {
                // both arrays are equal
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }      
    }
	
	static void getArrayUnion (int arrX[], int arrY[], int x, int y)
    {
        // Before finding union, make sure arrX[0...x-1] is smaller
        if (x > y) 
        {
            int tempp[] = arrX;
            arrX = arrY;
            arrY = tempp;
 
            int temp = x;
            x = y;
            y = temp;
        }
 
        // Now arrX[] is smaller
        // Sort the first array and print its elements
        // (these two steps can be swapped as order in
        // output is not important)
        
        Arrays.sort(arrX);
        
        for (int i = 0; i < x; i++)
            System.out.print(arrX[i] + " ");
 
        // Search every element of bigger array in smaller
        // array and print the element if not found
        for (int i = 0; i < y; i++) 
        {
            if (binarySearch(arrX, 0, x - 1, arrY[i]) == -1)
                System.out.print(arrY[i] + " ");
        }
    }
	
	
	// A recursive binary search function.
	// Binary search ONLY works with the sort collection !
	// It returns location of x in given array arr[l..r] is present,
    // otherwise -1
	
    static int binarySearch (int arr[], int left, int right, int target)
    {
        if (right >= left) 
        {
            int mid = left + (right - left) / 2;
 
            // If the element is present at the middle itself
            if (arr[mid] == target)
                return mid;
 
            // If element is smaller than mid, then it can
            // only be present in left sub-array
            if (arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);
 
            // Else the element can only be present in right sub-array
            return binarySearch(arr, mid + 1, right, target);
        }
 
        // We reach here when element is not present in array
        return -1;
    }   
    
    
    static void getSumOfTwo (int arr[], int sum)
    {
    	for (int i = 0; i < arr.length; i++) {
    		
    		for (int j = i + 1; j < arr.length; j++) {
        		
        		if(arr[i] + arr[j] == sum) {
        			
        			System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
        		}
        	}
    		
    	}
    }
    
    
    static void getMiddleNumber (int num1, int num2, int num3)
    {
    	if ((num2 > num3 && num1 > num2)  ||
    		(num3 > num2 && num2 > num1))  
    	{
    		 System.out.println("Middle number: " + num2);
    	}
    	else 
    		if ((num2 > num3 && num3 > num1)  ||
    		    (num3 > num2 && num1 > num3))  
    		{
    			System.out.println("Middle number: " + num3);
    		}
    		else  System.out.println("Middle number: " + num1);	
    }	
}
