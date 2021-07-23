package basicExercisesPart1;
import java.util.Scanner;
/*83. Write a Java program to multiply corresponding elements of two arrays of integers. 
Sample Output:

Array1: [1, 3, -5, 4]                                                  
                                                                        
Array2: [1, 4, -5, -2]                                                 
                                                                       
Result: 1 12 25 -8*/
class Question83 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your length of array 1 and 2?");
		int x=sc.nextInt();

		
		System.out.println("Enter values of your array 1: ");
		int[] a=new int[x];
				for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter values of your array 2: ");
		int[] b=new int[x];
		for(int i=0;i<x;i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println("Your array 1 input is: ");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Your array 2 input is: ");
		for(int i=0;i<x;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		System.out.println("Multiplication result is: ");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]*b[i]+" ");
		}
		
sc.close();}
}