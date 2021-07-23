package basicExercisesPart1;
import java.util.Scanner;

/*Q35. Write a Java program to compute the area of a polygon. 
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722*/
class Question35 {
	static double area(int s,int n) {
		double area=(n*s*s)/(4*Math.tan(Math.PI/n));
		return area;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of side:");
		int s=sc.nextInt();
		System.out.println("Enter number of sides:");
		int n=sc.nextInt();
		double area=area(s,n);
		System.out.println("Area of given polygon is: "+area);
		sc.close();	}

}
