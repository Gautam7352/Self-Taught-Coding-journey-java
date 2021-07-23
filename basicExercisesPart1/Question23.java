package basicExercisesPart1;
import java.util.Scanner;
/*Q23. Write a Java program to convert a binary number to hexadecimal number. 
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D*/
class Question23 {

	public static void main(String[] args) {
// take input of binary number
		Scanner sc=new Scanner(System.in);
		int BinNum=sc.nextInt();
		String[] Hex= {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		String[] HexNum=new String[20];
		int TempHexNum=0, i=0;

	//I plan to separate my binary number into groups of 4 digits 1st
		while(BinNum!=0)
		{int TempBinary = BinNum%10000;
		int Pow=1;
		// then for each group i plan to use the formula: 2^3*b + 2^2*b + 2^1*b + 2^0*b
			while(TempBinary!=0) {
				
				int digit=TempBinary%10;
				TempHexNum=TempHexNum+digit*Pow;
				TempBinary=TempBinary/10;
				Pow=Pow*2;
				//System.out.println(Pow);// Sysout helped me in diagnosing the issue
			}	 
		BinNum=BinNum/10000;		
		HexNum[i++]=Hex[TempHexNum];
		}
		i--;
		while(i>=0) {
		System.out.print(HexNum[i--]+" ");}
sc.close();	}
}