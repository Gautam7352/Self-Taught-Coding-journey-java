package basicExercisesPart1;
import java.util.Scanner;
/*74. Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2. 
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10

true*/
class Question74 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Length of array: ");
	int i=sc.nextInt();
	if(i<2) {
		System.out.println(false);
		return;
	}
	int[] a=new int[i];
	for(int k=0;k<i;k++) {
		a[k]=sc.nextInt();
	}
	if(a[0]==10&&a[i-1]==10)
		System.out.println(true);
	else System.out.println(false);
sc.close();}
}
