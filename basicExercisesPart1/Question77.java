package basicExercisesPart1;
import java.util.Scanner;
/*Q77. Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays. Go to the editor
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]                                                   
Array2: [5, -50, 10]                                                   
New Array: [50, 10]*/
class Question77 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of 1st array: ");
		int i=sc.nextInt();
		System.out.println("Length of 2nd array: ");
		int j=sc.nextInt();
		if(i<2||j<2) {
			System.out.println(false);
			return;
		}
		int[] a=new int[i];
		int[] b=new int[j];

		System.out.println("Input values of 1st array");
		for(int k=0;k<i;k++) {
			a[k]=sc.nextInt();
		}
		System.out.println("Input values of 2nd array");
		for(int k=0;k<j;k++) {
			b[k]=sc.nextInt();
		}
		int[] l= {a[0],b[b.length-1]};
		System.out.println(l[0]+" "+l[1]);
sc.close();}
}