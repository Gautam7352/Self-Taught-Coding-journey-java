package basicExercisesPart1;
import java.util.Scanner;
/*69. Write a Java program to extract the first half of a string of even length. Go to the editor
Test Data: Python
Sample Output:
Pyt*/
class Question69 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String k=a.substring(0,a.length()/2);
	System.out.println(k);
sc.close();}
}
