package basicExercisesPart1;
import java.util.Scanner;
/*Write a Java program to compare two numbers. 
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39*/
class Question32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first integer:");
		int a=sc.nextInt();
		System.out.println("Input second integer:");
		int b=sc.nextInt();
		if(a!=b) {
			System.out.println(a+" != "+b);
		if(a>b)
			System.out.println(a+" > "+b);
		else
			System.out.println(a+" < "+b);
		if(a>b)
			System.out.println(a+" => "+b);
		else 
			System.out.println(a+" <= "+b);
		}
		else
			System.out.println(a+" = "+b);
sc.close();	}

}
