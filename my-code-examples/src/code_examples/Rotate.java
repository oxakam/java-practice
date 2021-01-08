package code_examples;

public class Rotate {

	public static void rotateMatrixClockwise (int [][]arr) {
		
		int length = arr.length;
		
		for(int x = 0; x < length/2; x++) {
			
//			int l = n - 1 - c;
//			 
//	        for (int i = 0; i < l - c; ++i) {
//	            int temp = arr;
//	 
//	            arr = arr[l - i];
//	            arr[l - i] = arr[l][l - i];
//	            arr[l][l - i] = arr[l];
//	            arr[l] = temp;
//	        }
			
//			int first = x;
//			int last = n - x - 1;
			
		
			//another solution...................
			
//			for(int i=first; i < last; i++) {
//				
//				int offset = i - first;
//				
//				//Save top as temporary variable
//				int top = matrix[first][i];
//				
//				//Left -> Top
//				matrix[first][i] = matrix[last - offset][first];
//				
//				//Bottom -> Left
//				matrix[last - offset][first] = matrix[last][last - offset];
//				
//				//Right -> Bottom
//				matrix[last][last - offset] = matrix[i][last];
//				
//				//Top -> Right
//				matrix[i][last] = top;
//				
//			}
		}
		
	}
	
	public static void main(String[] args) {
		
		rotateMatrixClockwise(null);
	}
	
}

