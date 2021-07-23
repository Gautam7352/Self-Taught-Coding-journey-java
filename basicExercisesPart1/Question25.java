package basicExercisesPart1;
import java.util.Scanner;
/*25. Write a Java program to convert a octal number to a decimal number. 
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8*/
class Question25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int OctNum=sc.nextInt();
		int DecNum=0;
		int temp=0;
		int pow=1;
		while(OctNum>0) {
			temp=OctNum%10;
			DecNum=DecNum+temp*pow;
			pow=pow*8;
			OctNum=OctNum/10;
		}
		System.out.println(DecNum);
sc.close();}
}
