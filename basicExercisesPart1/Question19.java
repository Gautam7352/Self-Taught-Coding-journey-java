package basicExercisesPart1;
import java.util.Scanner;
/*Q19. Write a Java program to convert a decimal number to binary number. 
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101 
 */
class Question19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a Decimal Number : ");
		int num=sc.nextInt();
		int[] result=new int[20];
		int i=0;
		while(num!=0) {
			
			if(num%2!=0)
				result[i]=1;
			else
				result[i]=0;
			i++;
			num=num/2;
		}
		
		if(result[i]==0)
			i--;
		System.out.println("Binary number is: ");
		while(i>=0)
		{	System.out.print(result[i]);
		i--;}
sc.close();	}
}
