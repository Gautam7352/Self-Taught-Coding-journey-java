package basicExercisesPart1;
import java.util.Scanner;

/*67. Write a Java program to insert a word in the middle of the another string. 
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output:

Python Tutorial 3.0*/
class Question67 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] k=a.split(" ");
		
		for(int i=0;i<2;i++) {
			if(i==1)
			System.out.println("Tutorial");
		System.out.print(k[i]);
		}
		
sc.close();	}
}
