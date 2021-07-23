package basicExercisesPart1;
import java.util.Scanner;
/*57. Write a Java program to accepts an integer and count the factors of the number. 
Sample Output:

Input an integer: 25                                                   
3*/
class Question57 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input an integer: ");
		int integer=sc.nextInt();
		int count=0;
		for(int i=1;i<=integer;i++) {
			if(integer%i==0)
				count++;
		}
		System.out.println(count);
sc.close();	}
}
