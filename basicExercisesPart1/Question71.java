package basicExercisesPart1;
import java.util.Scanner;
/*71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above. 
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

ythonutorial*/
class Question71 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.println(str1.substring(str1.length()+1-str1.length())+str2.substring(str2.length()+1-str2.length()));
sc.close();	}
}
