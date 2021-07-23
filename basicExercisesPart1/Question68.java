package basicExercisesPart1;

import java.util.Scanner;
/*Q68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above. 
Sample Output:

3.03.03.03.0*/
class Question68 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String k=a.substring((a.length()-3));
		System.out.println(k+k+k+k);
sc.close();	}
}
