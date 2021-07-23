package basicExercisesPart1;
import java.util.Scanner;
//98. Write a Java program to check if the value 20 appears three times and no 20's are next to each other in a given array of integers.
class Question98 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		System.out.println("Enter values of array");
		int count=0;
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
			
			if(a[i]==20)
				count++;
		}
		boolean k=true;
		for(int i=0;i<x;i++) {
			if(count!=3&&(a[i]==20&&a[i]==a[i+1])) 
			{k=false;
			break;}
			}
		System.out.println(k);
sc.close();}
}
