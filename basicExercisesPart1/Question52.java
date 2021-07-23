package basicExercisesPart1;
import java.util.Scanner;

/*Q52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. Go to the editor
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true*/
class Question52 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number :");
		int a=sc.nextInt();
		System.out.println("Input the second number:");
		int b=sc.nextInt();
		System.out.println("Input the third number :");
		int c=sc.nextInt();
		boolean q=((a+b)==c);
		System.out.println("Ther result is:"+q);
sc.close();}

}