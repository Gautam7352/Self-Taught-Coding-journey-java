package basicExercisesPart1;
import java.util.Scanner;
/*56. Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number. 
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:
5*/
class Question56 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit of range: ");
		int x=sc.nextInt();
		System.out.println("Enter upper limit of range: ");
		int y=sc.nextInt();
		System.out.println("Enter number to test divisibility of: ");
		int p=sc.nextInt();
		int count=0;
		for(int i=x;i<=y;i++) {
			if(i%p==0)
			count++;
			else continue;
		}
		System.out.println("Number of Factors of "+p+ " from "+x+" to "+ y +" are "+count);
sc.close();	}
}
