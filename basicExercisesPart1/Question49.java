package basicExercisesPart1;
import java.util.Scanner;

/*Q49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. Go to the editor
Sample Output:

Input a number: 20                                                     
1*/
class Question49 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x%2==0)
			System.out.println("1");
		else
			System.out.println("0");
sc.close();	}

}
