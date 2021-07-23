package basicExercisesPart1;
import java.util.Scanner;
/*94. Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.*/
class Question94 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in array should be: ");
		int x=sc.nextInt();
		int[] a=new int[x];
		
		//array elements are given by number of elements in array		
		for(int i=0;i<x;i++) {
			a[i]=i+1;
		}
		System.out.println("Array before sorting: ");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
		}
		
		int evenLen=0;
		for(int i=0;i<x;i++) {
			if(a[i]%2==0)
				evenLen++;
		}
		int[] evenArr=new int[evenLen];
		int oddLen=x-evenLen;
		int[] oddArr=new int[oddLen];
		oddLen=evenLen=0;
		for(int i=0;i<x;i++) {
			if(a[i]%2==0) {
				evenArr[evenLen++]=a[i];
			}
			if(a[i]%2!=0) {
				oddArr[oddLen++]=a[i];
			}
		}
		int q=0;
		for(int i=0;i<x;i++) {
			if(i<oddLen)
				a[i]=oddArr[i];
			else
				a[i]=evenArr[q++];
		}
		System.out.println();
		System.out.println("Array after sorting: ");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
		}
		
sc.close();}
}
