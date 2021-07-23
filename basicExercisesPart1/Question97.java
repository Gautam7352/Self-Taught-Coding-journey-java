package basicExercisesPart1;
import java.util.Scanner;
//97. Write a Java program to check if an array of integers contains a specified number next to each other or there are two same specified numbers separated by one element.
class Question97 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		System.out.println("Enter values of array");
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the value of specified number");
		int specNum=sc.nextInt();
		System.out.println("Given Array: ");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<x;i++) {
			if(a[i]==specNum&&a[i+1]==specNum) {
				System.out.println("array of integers contains a specified number next to each other");
				break;}
			else if(a[i]==specNum&&a[i+2]==specNum) {
				System.out.println("array of integers contains two same specified numbers separated by one element");
				break;}
			else {
				System.out.println("Conditions unfulfilled");
				break;}
		}
		
sc.close();}
}