package basicExercisesPart1;
import java.util.Scanner;
//99. Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers. 
class Question99 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		System.out.println("Enter values of array");
				for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
				
		System.out.println("what is your specified number");
		int specnum=sc.nextInt();
		boolean k=false;
		for(int i=0;i<x;i++) {
			if(a[i]==specnum) {
				i++;
				k=true;}
			else 
				k=false;
			}
		System.out.println(k);
sc.close();}
}
