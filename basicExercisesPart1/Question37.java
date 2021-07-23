package basicExercisesPart1;
import java.util.Scanner;

/*37. Write a Java program to reverse a string. Go to the editor
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT*/
class Question37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input string:");
		char[] x=sc.nextLine().toCharArray();
		System.out.println("Reversed string:");
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]);
		}
sc.close();	}
}
