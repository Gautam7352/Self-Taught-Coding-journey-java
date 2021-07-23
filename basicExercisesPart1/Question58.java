package basicExercisesPart1;
import java.util.Scanner;
/*Q58. Write a Java program to capitalize the first letter of each word in a sentence. 
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.         
The Quick Brown Fox Jumps Over The Lazy Dog.*/
class Question58 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String a=sc.next();
			String k=a.substring(0, 1);
			k=k.toUpperCase();
			a=a.substring(1);
			System.out.print(k+a+" ");
		}
		
sc.close();}
}
//