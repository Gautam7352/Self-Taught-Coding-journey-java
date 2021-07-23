package basicExercisesPart1;

import java.util.Scanner;

/*75. Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2. 
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false*/
 class Question75 {

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
		if(a[0]==a[i-1])
			System.out.println(true);
		else System.out.println(false);
sc.close();}
}
