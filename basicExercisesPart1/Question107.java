package basicExercisesPart1;
import java.util.Scanner;
//107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
class Question107 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		System.out.println("Enter values for array");
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=1;i<x-1;i++) {
			if(a[i-1]+1==a[i]) {
				count++;}
		}
		if(count==3)
			System.out.println(true);
		else System.out.println(false);
sc.close();}
}
