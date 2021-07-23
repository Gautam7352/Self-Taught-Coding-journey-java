package basicExercisesPart1;
import java.util.Scanner;
//101. Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.
class Question101 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in the array is:");
		int i=sc.nextInt();
		int[] a=new int[i];
		int ten=0;
		int twenty=0;
		System.out.println("Input values in array:");
		for(int x=0;x<i;x++) {
			a[x]=sc.nextInt();
		}
		for(int x=0;x<i;x++) {
			if(a[x]==10)
				ten++;
			if(a[x]==20)
				twenty++;
		}
		System.out.print("Test for the number of 10 is greater than number to 20's in a given array of integers is: ");
		if(ten>twenty)
			System.out.println(true);
		else
			System.out.println(false);
sc.close();}
}