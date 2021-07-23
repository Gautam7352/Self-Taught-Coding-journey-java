package basicExercisesPart1;
import java.util.Scanner;

/*22. Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4 */
class Question22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int binNum=sc.nextInt();
		sc.close();
		int DecNum=0;
		int rem=0,BinConv=1;
		
		while(binNum!=0) {
			rem=binNum%10;
			DecNum=DecNum+BinConv*rem;
			BinConv=BinConv*2;
			binNum=binNum/10;
		}
		System.out.println("Decimal Number: "+DecNum);
	}
}
