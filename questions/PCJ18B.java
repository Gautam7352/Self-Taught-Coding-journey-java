package questions;
import java.util.*;

 class PCJ18B {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int N=sc.nextInt();
			int count=0;
			while(N>0) {
				int k=0;
				for(k=0;k*k<=(int)(N);k++) {}
				count++;
				N=N-(k*k);
			}
			
			System.out.println(count);
		}
sc.close();	}
}
