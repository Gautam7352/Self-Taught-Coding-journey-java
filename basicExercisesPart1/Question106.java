package basicExercisesPart1;
import java.util.Scanner;
//106. Write a Java program to create a new array that is left shifted from a given array of integers.
class Question106 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		int temp=0;
		System.out.println("Enter values for array");
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array before shifting is:");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
		}
		temp=a[0];
		for(int i=1;i<x;i++) {
			a[i-1]=a[i];
		}
		a[x-1]=temp;
		System.out.println();
		System.out.println("Array after shifting is:");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
		}
		
sc.close();}
}
