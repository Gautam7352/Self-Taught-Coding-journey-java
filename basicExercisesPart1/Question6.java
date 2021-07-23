package basicExercisesPart1;
import java.util.Scanner;
/*Q6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.*/
class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" + "+b+" = "+(a-b));
		System.out.println(a+" x "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" mod "+b+" = "+(a%b));
sc.close();
	}

}
