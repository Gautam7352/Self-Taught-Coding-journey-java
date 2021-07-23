package basicExercisesPart1;

import java.util.Scanner;

/*70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length. 
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

PythonTutorialPython*/
class Question70 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()>str2.length())
			System.out.println(str2+str1);
		else
			System.out.println(str1+str2);
sc.close();	}
}
