package basicExercisesPart1;
import java.util.Scanner;
class Question64 {
/*64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers. 
Sample Output:

Input the first number : 35                                            
Input the second number: 45                                            
Result: true*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number : ");
		int a=sc.nextInt();
		System.out.println("Input the second number : ");
		int b=sc.nextInt();
		boolean cond=false;

		if(a>25&&a<75&&b>25&&b<75) 
		{while(a>0&&cond==false) {
				int x=a%10;
				a/=10;
				while(b>0&&cond==false) {
					int y=b%10;
					b/=10;
					if(x==y)
						cond=true;
					else continue;
				}
			}
		}
		System.out.println("Result: "+cond);
sc.close();}
}
