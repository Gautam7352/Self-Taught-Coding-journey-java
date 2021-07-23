package basicExercisesPart1;
import java.util.Scanner;
/*76. Write a Java program to test if the first and the last element of two array of integers are same. The length of the array must be greater than or equal to 2.
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:

false*/
class Question76 {

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
		if(a[0]==a[i-1]&&b[0]==b[j-1])
			System.out.println(true);
		else System.out.println(false);
sc.close();}
}