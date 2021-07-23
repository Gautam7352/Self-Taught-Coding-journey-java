package basicExercisesPart1;

import java.util.Scanner;

/*72. Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
Test Data: Str1 = " "
Sample Output:

###*/
class Question72 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		if(str1.length()<3){
			System.out.print(str1);
			for(int i=0;i<3-str1.length();i++) {
				System.out.print('#');
			}
		}
		else System.out.println(str1);
sc.close();	}	
}
