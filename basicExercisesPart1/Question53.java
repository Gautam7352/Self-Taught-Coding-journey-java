package basicExercisesPart1;
import java.util.Scanner;
/*53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. 
 If "abc" is true second number does not need to be greater than first number. 
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true*/
class Question53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number :");
		int a=sc.nextInt();
		System.out.println("Input the second number:");
		int b=sc.nextInt();
		System.out.println("Input the third number :");
		int c=sc.nextInt();
		boolean abc=true;
		if((b>a&&c>b)||abc)
			System.out.println(true);
		else System.out.println(false);
sc.close();	}
}
