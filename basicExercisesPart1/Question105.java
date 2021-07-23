package basicExercisesPart1;
import java.util.Scanner;
//105. Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.
class Question105 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of array: ");
		int i=sc.nextInt();
		int[] a=new int[i];
		System.out.println("Enter values of array");
		for(int k=0;k<i;k++) {
			a[k]=sc.nextInt();
		}
		
		if(a[0]==a[i-2]&&a[1]==a[i-1])
			System.out.println(true);
		else System.out.println(false);
sc.close();}
}
