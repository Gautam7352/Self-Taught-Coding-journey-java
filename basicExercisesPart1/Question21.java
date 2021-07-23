package basicExercisesPart1;
import java.util.Scanner;
/*Q21. Write a Java program to convert a decimal number to octal number. 
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17  */
class Question21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a decimal number: ");
		int DecNum=sc.nextInt();
		int[] OctNum=new int[20];
		int i=0;
		
		while(DecNum!=0) {
			OctNum[i++]= DecNum%8;
			DecNum=DecNum/8;
		}
		System.out.println("The Octal number is: ");
		for(int j=i-1;j>=0;j--)  
		System.out.print(OctNum[j]);
		
sc.close();}
}
