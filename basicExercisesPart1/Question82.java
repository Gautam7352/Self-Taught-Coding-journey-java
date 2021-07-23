package basicExercisesPart1;
import java.util.Scanner;
/*82. Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length). 
Sample Output:

Original Array: [20, 30, 40, 50, 67]                                   
Largest element between first, last, and middle values: 67 */
class Question82 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("What is your length of array?");
		int k=sc.nextInt();
		
		System.out.println("Enter values of your array: ");
		int[] a=new int[k];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Your array input is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		int b=Math.max(a[0], a[a.length-1]);
		if(k%2!=0)
			c=a[(a.length/2)];
		else
			c=Math.max(a[a.length/2], a[a.length/2+1]);
		int g=Math.max(b, c);
		
		System.out.println("Largest element between first, last, and middle values: "+g);
sc.close();	}
}
