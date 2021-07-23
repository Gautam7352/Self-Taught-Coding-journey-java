package basicExercisesPart1;
import java.util.Scanner;

/*Q34. Write a Java program to compute the area of a hexagon. 
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938*/
class Question34 {
	static double area(int s){
		double area=(6*s*s)/(4*Math.tan(Math.PI/6));
		return area;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input length of side: ");
		int s=sc.nextInt();
		double area=area(s);
		System.out.println("The area of hexagon is: "+area);
sc.close();	}

}
