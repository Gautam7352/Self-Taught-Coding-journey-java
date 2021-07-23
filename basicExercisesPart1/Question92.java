package basicExercisesPart1;
import java.util.Scanner;
/*92. Write a Java program to count the number of even and odd elements in a given array of integers. */
class Question92 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the lengths of array?");
		int lenngthOfArray=sc.nextInt();
		System.out.println("Input values of array:");
		int[] a=new int[lenngthOfArray];
		for(int i=0;i<lenngthOfArray;i++) a[i]=sc.nextInt();
		int even=0;
		int odd=0;
		System.out.println("Your given array is:");
		for(int i=0;i<lenngthOfArray;i++) System.out.print(a[i]);
		for(int x:a) {
			if(x%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Number of odd numbers in array "+odd+" Number of even numbers in array "+even);
sc.close();}
}
