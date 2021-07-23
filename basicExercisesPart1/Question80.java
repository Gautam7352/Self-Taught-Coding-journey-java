package basicExercisesPart1;
/*80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers . 
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 */
class Question80 {
	
		public static void main(String[] args) {
			int[] OriginalArray= {20, 30, 40};
						
			System.out.println("Larger value between first and last element: "+Integer.max(OriginalArray[0],OriginalArray[2]));
	}
}
