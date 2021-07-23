package basicExercisesPart1;
import java.util.Scanner;
//86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
class Question86 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=1) {
		if(n%2==0)
			n=n/2;
		else 
			n=n*3+1;
		}
			
sc.close();}
}
