package basicExercisesPart1;
import java.util.Scanner;
//87. Write a Java program that read an integer and calculate the sum of its digits and write the number of each digit of the sum in English
class Question87 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int integer=sc.nextInt();
		int sum=0, temp1=0, temp2=0, i=0,k=0;
		k=integer;
		String[] die= {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		while(k>0) {
			sum=sum+k%10;
			k=k/10;
		}
		temp1=sum;
		while(temp1>0) {
			temp2=temp2*10+temp1%10;
			temp1/=10;
		}
		System.out.println("Sum of digits of given number "+integer+" is: "+sum);
		System.out.print("In words it is: ");		
		while(temp2>0) {
			i=temp2%10;
			System.out.print(die[i]+" ");
			temp2/=10;
		}
		
sc.close();}
}
