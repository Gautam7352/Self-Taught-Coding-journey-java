package basicExercisesPart1;
import java.util.Scanner;
/*Q17. Write a Java program to add two binary numbers. 
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101*/
class Question17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int binary1=sc.nextInt();// taking 1st input of binary number 
		int binary2=sc.nextInt();// taking 2nd input of binary number
		int i=0;	// variable to iterate through array of result
		int remainder=0;// variable to carry remainders
		int[] sum=new int[25];// result array variable
		
		while(binary1!=0||binary2!=0) 	//Loop iteration until either of any binary number value becomes 0
		{	sum[i++]=(binary1%10 + binary2%10 + remainder)%2;	//taking one digit from the right in the numbers and operating them according to rules of binary addition and storing in array inverse of actual answer
			remainder=(binary1%10 + binary2%10 + remainder)/2; //taking one digit from the right in the numbers and operating them to get remainders of all additions
			binary1=binary1/10;			//modifying 1st number for further calculation
			binary2=binary2/10;			//modifying 2nd number for further calculation
		}
		
		if(remainder!=0)		// there are chances that a number will be left in carry of the addition. this check is to store it in the result array. 
			sum[i++]=remainder;
		i--;		// during result printing we don't want extra 0 in front of result.
		while(i>=0) 
		{System.out.print(sum[i--]);}// printing the result. reverse of array stored.
sc.close();}
}