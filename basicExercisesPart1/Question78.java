package basicExercisesPart1;
import java.util.Scanner;
/*78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:

Original Array: [5, 7]                                                 
true */
class Question78 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] l= {sc.nextInt(), sc.nextInt()};
		if(l[0]==4||l[0]==7||l[1]==4||l[1]==7)
			System.out.println(true);
		else
			System.out.println(false);
sc.close();}
}
