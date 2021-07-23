package basicExercisesPart1;
import java.util.Scanner;
/*109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.

Example 1:
n = 3
The coins can form the following rows:
$
$ $
We will return 2 rows.
Example 2:
n = 4
The coins can form the following rows:
$
$ $
$
We will return 2 rows as the 3rd row is incomplete.
Example 3:
n = 5
The coins can form the following rows:
$
$ $
$ $
We will return 2 rows as the 3rd row is incomplete.*/
class Question109 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of coins: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print("*");
			int count =0;
			if(count==i) {
				System.out.println();
				count=0;
			}count++;
		}
		
sc.close();
}
}