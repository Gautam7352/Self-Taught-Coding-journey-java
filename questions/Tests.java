package questions;
import java.util.Scanner;

public class Tests
{
    // Method to calculate xor
    static int computeXOR(int n)
    {
        // If n is a multiple of 4
        if (n % 4 == 0)
            return n;
      
        // If n%4 gives remainder 1
        if (n % 4 == 1)
            return 1;
      
        // If n%4 gives remainder 2
        if (n % 4 == 2)
            return n + 1;
      
        // If n%4 gives remainder 3
        return 0;
    }
     
    // Driver method
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int T=sc.nextInt();
    	while(T-->0) {
         int n = sc.nextInt();
         for(int i=0;i<n;i++) {
 //       	 int x=sc.nextInt();
  //      	 int y=sc.nextInt();
         }
         System.out.println(computeXOR(n));}
    sc.close();}
}


