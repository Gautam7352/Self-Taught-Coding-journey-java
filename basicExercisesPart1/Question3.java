package basicExercisesPart1;
/*Q3 Write a Java program to divide two numbers and print on the screen.*/
import java.util.Scanner;

class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input 1st number");
		int a=sc.nextInt();
		System.out.println("input 2nd number");
		int b=sc.nextInt();
		
		System.out.print("sum of given numbers= "+(a/b));
sc.close();	}

}
