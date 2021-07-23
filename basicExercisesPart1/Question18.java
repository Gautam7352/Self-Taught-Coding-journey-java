package basicExercisesPart1;
import java.util.Scanner;
/*18. Write a Java program to multiply two binary numbers. 
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110 */
class Question18 {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the first binary number: ");
		int binary1=sc.nextInt();
		System.out.print("Input the second binary number: ");
		int binary2=sc.nextInt();
		
		int product=binary1*binary2;
		System.out.println("Product of two binary numbers: "+product);
sc.close();	}
}