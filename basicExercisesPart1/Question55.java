package basicExercisesPart1;
import java.util.Scanner;
/*55. Write a Java program to convert seconds to hour, minute and seconds. 
Sample Output:

Input seconds: 86399                                                   
23:59:59*/
class Question55 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of time in seconds: ");
		int sec=sc.nextInt();
		
		int hr=(sec/60)/60;
		int min=(sec-(hr*3600))/60;
		sec=sec-(hr*3600)-(min*60);
		System.out.println(hr+":"+min+":"+sec);
sc.close();	}
}
