package basicExercisesPart1;
import java.util.Scanner;
//104. Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array before the last element value 10.
class Question104 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in the array is:");
		int i=sc.nextInt();
		int[] a=new int[i];
		int y=0;
		System.out.println("Input values in array:");
		for(int x=0;x<i;x++) {
			a[x]=sc.nextInt();
		}
		for(int x=0;x<i;x++) {
			if(a[x]==10) 
				y=x;
		}
		System.out.println("New array is: ");
		int[] b=new int[y];
		for(int x=0;x<b.length;x++) {
			b[x]=a[x];
			System.out.print(b[x]+" ");
		}		
sc.close();
	}
}
