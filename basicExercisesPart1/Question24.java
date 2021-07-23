package basicExercisesPart1;
import java.util.Scanner;
/*24. Write a Java program to convert a binary number to a Octal number. Go to the editor
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7 */
class Question24 {
	public static void main(String[] args) {
		// take input of binary number
				Scanner sc=new Scanner(System.in);
				int BinNum=sc.nextInt();
				int[] Oct= {0, 1, 2, 3, 4, 5, 6, 7};
				int[] OctNum=new int[20];
				int TempOctNum=0, i=0;

			//I plan to separate my binary number into groups of 4 digits 1st
				while(BinNum!=0)
				{int TempBinary = BinNum%1000;
				int Pow=1;
				// then for each group i plan to use the formula: 2^3*b + 2^2*b + 2^1*b + 2^0*b
					while(TempBinary!=0) {
						
						int digit=TempBinary%10;
						TempOctNum=TempOctNum+digit*Pow;
						TempBinary=TempBinary/10;
						Pow=Pow*2;
						
					}	 
				BinNum=BinNum/1000;		
				OctNum[i++]=Oct[TempOctNum];
				}
				i--;
				while(i>=0) {
				System.out.print(OctNum[i--]+" ");}
		sc.close();	}
}
