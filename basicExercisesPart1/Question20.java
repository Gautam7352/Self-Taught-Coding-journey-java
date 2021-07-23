package basicExercisesPart1;
import java.util.Scanner;

/*20. Write a Java program to convert a decimal number to hexadecimal number. 
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F */
class Question20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a decimal number: ");
		int num=sc.nextInt();
		int pos=0;
		String HexDecNum="";
		char[] Hex= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		while(num!=0) {
			pos=num%16;
			HexDecNum=Hex[pos]+HexDecNum;
			num=num/16;
		}
		System.out.println("The Hexadecimal number is: "+HexDecNum);
sc.close();	}
}
