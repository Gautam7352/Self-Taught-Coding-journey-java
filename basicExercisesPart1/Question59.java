package basicExercisesPart1;
import java.util.Scanner;
/*Q59. Write a Java program to convert a given string into lowercase. 
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
the quick brown fox jumps over the lazy dog.*/
class Question59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		String a=sc.next();	
		a=a.toLowerCase();
		System.out.print(a+" ");
		}
sc.close();}
}
