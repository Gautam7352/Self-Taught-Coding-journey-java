package basicExercisesPart1;
import java.util.Scanner;
/*60. Write a Java program to find the penultimate (next to last) word of a sentence. 
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy*/
class Question60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a String: ");
		String string=sc.nextLine();
		String[] words=string.split(" ");
		System.out.println(words[words.length-2]);
sc.close();	}
}
