package basicExercisesPart1;
import java.util.Scanner;
/*Q63. Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same,
  return 0 and return the smaller value if the two values have the same remainder when divided by 6. 
Sample Output:

Input the first number : 12                                            
Input the second number: 13                                            
Result: 13*/
class Question63 {
	public static int compareSmall(int a, int b) {
		if(a<b)
			return a;
		else 
			return b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number : ");
		int a=sc.nextInt();
		System.out.println("Input the second number : ");
		int b=sc.nextInt();
		
		if(a==b)
			System.out.println(0);
		else if(a%6==b%6)
			System.out.println(compareSmall(a,b));
		else if(a>b)
			System.out.println(a);
		else if(b>a)
			System.out.println(b);
sc.close();	}
}
