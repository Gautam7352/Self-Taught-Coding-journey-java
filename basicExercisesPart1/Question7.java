package basicExercisesPart1;
import java.util.Scanner;
/*Q7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/
class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(x +" x "+i+" = "+(x*i));
		}
sc.close();	}

}
