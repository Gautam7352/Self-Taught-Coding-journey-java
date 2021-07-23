package basicExercisesPart1;
import java.util.Scanner;
//96. Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
class Question96 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		int y=0;
		System.out.println("Enter values of array: ");
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<x;i++) {
			if(a[i]==10) {
			y=i;
			break;}
		}
		
		for(int i=y;i<x;i++) {
			if(a[i]==20) {
				System.out.println("there is a 10 in a given array at "+y+ " with a 20 somewhere later in the array");
			}
		}
		
sc.close();}
}
