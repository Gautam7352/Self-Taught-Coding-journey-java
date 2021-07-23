package questions;
import java.util.Arrays;
import java.util.Scanner;
/*Given an array A[] of N elements. The task is to complete a function which returns true if triplets exists in array A whose sum is 0 else return false*/
/*Input format
 * -number denoting number of elements in array   -number denoting elements of array*/

/*O(n^3) method
 * Given is our array and we have 3 indexing numbers i, j, k
 * firstly we will mark i with first array element, j with second and k with third. 
 * while keeping i and j constant we will firstly move index k up to the last element while testing whether our condition is satisfied or not.
 * as k reaches the end of array we will move j one step forward in array then keep moving k as j and k both reaches the end we will move index i one step forward
 * and keep doing the same until all three indices reaches the end.
 * we will print so if our condition is satisfied or not 
 */

/*O(n) method
 * Given an array and 3 indexes i, j and k
 * firstly we will mark 1st element with i 2nd with j and last with k
 * the process:
 * while keeping i constant 
 * 				if sum of j and k is greater than i
 * 						we will decrease indexing of k
 * 				else if sum of j and k is less than i
 * 						we will increase indexing of j
 * 				else if they are equal we have found the answer
 * if answer is not found then we will continue to increase indexing of i and repeat the above process until we find the answer
 * we will print so if our condition is satisfied or not 
 */
class GFG_Zero_triplet {

	public boolean findTriplets(int arr[], int n) {
		
		Arrays.sort(arr);
		
		for(int i=0;i<n-2;i++) {
			if(twoSum(arr, -arr[i],i+1)) return true;
		}
		return false;
	}
	
	public boolean twoSum(int a[], int x, int i) {
		int j=a.length-1;
		
		while(i<j) {
			if(a[i]+a[j]>x) {
				j--;
			} else if(a[i]+a[j]<x) {
				
			} else {
				return true;
			}
		} 
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		GFG_Zero_triplet g=new GFG_Zero_triplet();
		if(g.findTriplets(a, n))
			System.out.println("1");
		else
			System.out.println("0");

sc.close();}
}
