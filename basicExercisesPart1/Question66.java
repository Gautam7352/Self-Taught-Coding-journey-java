package basicExercisesPart1;
/*66. Write a Java program to compute the sum of the first 100 prime numbers. 
Sample Output:

Sum of the first 100 prime numbers: 24133 */
class Question66 {
	
	static boolean PrimeTest(int k) {
		for(int i=3;i*i<=k;i+=2) {
			if(k%i==0)
				return false;
			}
		return true;
	}
	
	public static void main(String[] args) 
{		int sum=1;				
		int count=0;
		for(int i=0;count<100;i++) 
		{
			if(i%2!=0) 
			{if(PrimeTest(i))
			  {sum=sum+i;}
			}
			count++;
		}		
		
System.out.println(sum);
return;}
}