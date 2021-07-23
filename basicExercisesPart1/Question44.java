package basicExercisesPart1;

import java.util.Scanner;

/*Q44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 
Sample Output:

Input number: 5                                                        
5 + 55  + 555*/
class Question44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<3;i++) {
			sum=sum+n;
			n=(n*10)+n;
			}System.out.println(sum);
sc.close();	}
}
