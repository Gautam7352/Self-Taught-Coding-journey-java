package basicExercisesPart1;
import java.util.Scanner;

/*Write a Java program and compute the sum of the digits of an integer. 
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7*/
class Question33 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int temp;int sum=0;
		int x=sc.nextInt();
		while(x>0) {
			temp=x;
			temp=temp%10;
			x=x/10;
			sum=sum+temp;
		}
		System.out.println(sum);
sc.close();	}

}
