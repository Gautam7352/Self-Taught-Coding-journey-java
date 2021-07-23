package basicExercisesPart1;
import java.util.Scanner;
/*84. Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more. 
Test data: "Python" will be "honPythonhon"
Sample Output:
honPythonhon*/
class Question84 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=a.substring(a.length()-3);
		System.out.println(b+a+b);
sc.close();}
}