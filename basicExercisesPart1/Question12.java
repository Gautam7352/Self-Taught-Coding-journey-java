package basicExercisesPart1;
import java.util.Scanner;

/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/
class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println((a+b+c)/3);
sc.close();	}

}
