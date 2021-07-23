package basicExercisesPart1;
import java.util.Scanner;
/*95. Write a Java program to create an array (length!=0) of string values. The elements will contain "0", "1", "2" … through ... n-1*/
class Question95 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String[] a=new String[i];
		
		for(int x=0;x<i;x++) {
			a[x]=String.valueOf(x);
		}
		for(int x=0;x<i;x++) {
			System.out.print(a[x]+" ");
		}

sc.close();}
}
