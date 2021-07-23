package basicExercisesPart1;
import java.util.Scanner;
/*93. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.*/
class Question93 {
	
	public static boolean test10(int[] a) {
		boolean k=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==10) 
			{k=true;break;}
		}
	return k;
	}
	public static boolean test20(int[] a) {
		boolean k=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==20) 
			{k=true;break;}
		}
	return k;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the lengths of array?");
		int lenngthOfArray=sc.nextInt();
		System.out.println("Input values of array:");
		int[] a=new int[lenngthOfArray];
		for(int i=0;i<lenngthOfArray;i++) a[i]=sc.nextInt();
		
		boolean condition=false;
		
		if(Question93.test10(a)==true||Question93.test20(a)==true)
			condition=true;
		
		if(Question93.test10(a)==true&&Question93.test20(a)==true)
			condition=false;
		
		System.out.println("The condition is:"+condition);
sc.close();}
}