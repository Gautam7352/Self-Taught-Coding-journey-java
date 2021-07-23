package basicExercisesPart1;
import java.util.Scanner;
/*Q61. Write a Java program to reverse a word. 
Sample Output:

Input a word: dsaf
Reverse word: fasd*/
class Question61 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input word: ");
		String s=sc.next();
		String[] chars=s.split("");
		System.out.println("Reverse word: ");
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
sc.close();}
}
