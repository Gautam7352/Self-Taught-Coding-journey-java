package basicExercisesPart1;
import java.util.Scanner;
/*65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator. 
Sample Output:

Input the first number : 19                                            
Input the second number: 7                                             
5 */
class Question65 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number : ");
		int a=sc.nextInt();
		System.out.println("Input the second number : ");
		int b=sc.nextInt();
		while(a-b>0) {
			a=a-b;
		}
		System.out.println(a);
sc.close();}
}
