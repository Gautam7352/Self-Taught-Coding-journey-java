package basicExercisesPart1;
import java.util.Scanner;
/*15. Write a Java program to swap two variables.*/
 class Question15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		System.out.println("Before swapping value of a is "+a+" value of b is "+b);
		int temp;
		temp=a;
		a=b; b=temp;
		System.out.println("After swapping value of a became "+a+" value of b "+b);
		
sc.close();	}

}
