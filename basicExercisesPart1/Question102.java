package basicExercisesPart1;
import java.util.Scanner;
//102. Write a Java program to check if a specified array of integers contains 10's or 30's.
class Question102 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		boolean cond=false;
		System.out.println("Enter values of array");
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		if(a[i]==10||a[i]==30)
			cond=true;
		}
		System.out.println("Test if a specified array of integers contains 10's or 30's: "+cond);
		
sc.close();}
}
