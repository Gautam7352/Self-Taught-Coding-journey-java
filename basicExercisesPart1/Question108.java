package basicExercisesPart1;
import java.util.Scanner;
//108. Write a Java program to add all the digits of a given positive integer until the result has a single digit. 
class Question108 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit to be modified:");
		int x=sc.nextInt();
		int sum=0,digit;
		while(x>9) {
			while(x>0) {
				digit=x%10;
				x=x/10;
				sum=sum+digit;
			}
			x=sum;
		}
		System.out.println("The modified digit is: "+x);
sc.close();	}
}
