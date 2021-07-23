package basicExercisesPart1;
import java.util.Scanner;
//100. Write a Java program to count the two elements of two given arrays of integers with same length, differ by 1 or less. 
class Question100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in arrays should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		System.out.println("Enter values of array 1");
				for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
				
		int[] b=new int[x];
		System.out.println("Enter values of array 2");
		for(int i=0;i<x;i++) {
			b[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<x;i++) {
			if(Math.abs(a[i]-b[i])<=1&&a[i]-b[i]!=0)
				count++;
		}
		System.out.println(count);
		
sc.close();}
}