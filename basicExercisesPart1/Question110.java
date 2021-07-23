package basicExercisesPart1;
import java.util.Scanner;
/*110. Write a Java program to check whether a given integer is a power of 4 or not. 
Given num = 64, return true. Given num = 6, return false.*/
	class Question110 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Number to be tested:");
			int x=sc.nextInt();
			if(x%4==0)
				System.out.println(true);
			else
				System.out.println(false);
sc.close();}
}
