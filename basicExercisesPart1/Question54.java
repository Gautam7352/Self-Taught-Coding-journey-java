package basicExercisesPart1;
import java.util.Scanner;

/*Q54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. 
 The integers are non-negative. 
Sample Output:
Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true*/
 class Question54 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number");
		int a=sc.nextInt();
		System.out.println("Input the second number");
		int b=sc.nextInt();
		System.out.println("Input the third number");
		int c=sc.nextInt();
		
		if(a%10==b%10 || b%10==c%10 || a%10==c%10)
			System.out.println("The result is: true");
		else
			System.out.println("The result is: false");
				
sc.close();}
}
