package basicExercisesPart1;
import java.util.Scanner;
/*81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array. 
Sample Output:

Original Array: [20, 30, 40]                                           
New array after swapping the first and last elements: [40, 30, 20] */
class Question81 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your length of array?");
		int k=sc.nextInt();
		if(k<2) {
			sc.close();
			return;}
		int[] a=new int[k];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Your array input is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int temp=a[0];
		a[0]=a[k-1];
		a[k-1]=temp;
		System.out.println("\nYour array after modification is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}		
sc.close();}
}
