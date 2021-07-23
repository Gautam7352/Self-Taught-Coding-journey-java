package basicExercisesPart1;
import java.util.Scanner;
/*Q102. Write a Java program to compute the number of trailing zeros in a factorial.

Example
7! = 5040, therefore the output should be 1.*/
class Question112 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number to be computed factorial of");
		int i=sc.nextInt();
		sc.close();
		int factorial=1;
		while(i>0) {
			factorial*=i;
			i--;
		}
		int d=0;
		int count=0;
		while(factorial>0) {
			d=factorial%10;
			if(d==0)
				count++;
			else
				break;
			factorial=factorial/10;
		}
		System.out.println("Number of trailing zeroes in factorial is");
		System.out.println(count);
}
}
