package basicExercisesPart1;

import java.util.Scanner;

/*62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others.
Sample Output:

Input the first number : 15                                            
Input the second number: 20                                            
Input the third number : 25                                            
false*/
class Question62 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number : ");
		int a=sc.nextInt();
		System.out.println("Input the second number: ");
		int b=sc.nextInt();
		System.out.println("Input the third number : ");
		int c=sc.nextInt();
		
		if((a>19||b>19||c>19)&&(a<b-c||b<a-c||c<b-a||a<c-b||b<c-a||c<a-b)) 
			System.out.println(true);
		else
			System.out.println(false);
		
sc.close();}
}
