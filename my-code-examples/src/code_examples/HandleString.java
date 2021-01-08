package code_examples;

 class HandleString {

	public static void main(String[] args) { 
		
	     System.out.print(LongestWord("Its my life"));
	     System.out.println();
	     
	     String str = "ABD"; 	//print all permutations of a given string. 
	     int n = str.length(); 	    
	     permute(str, 0, n-1); 
	}
	
	public static String LongestWord(String sentence) {
	    
		String[] senArray = sentence.split("[^a-z^0-9]");
		
		int longestIndex = 0;
		
		String longestWord = "";
		
		for (int i = 0; i < senArray.length; i++) {

			if (senArray[i].length() > longestIndex) {
				
				longestWord = senArray[i];
				longestIndex = senArray[i].length();
			}
		}
	    return longestWord;
	  }
	
	/* @param - str string to calculate permutation for 
     * @param - l start index 
     * @param - r end index 
     */
	private static void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    }
	/* @param - a string value 
     * @param - i position 1 
     * @param - j position 2 
     * @return - swapped string 
     */
	public static String swap(String a, int i, int j) 
    { 
        char temp;
        
        char[] charArray = a.toCharArray();
        
        temp = charArray[i] ;
        
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        
        return String.valueOf(charArray); 	//swapped string 
    }

}
