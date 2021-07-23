package basicExercisesPart1;
import java.util.Scanner;
/*Q36. Write a Java program to compute the distance between two points on the surface of earth. 
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
	Input the latitude of coordinate 1: 25
	Input the longitude of coordinate 1: 35
	Input the latitude of coordinate 2: 35.5
	Input the longitude of coordinate 2: 25.5
Expected Output:
	The distance between those points is: 1480.0848451069087 km */
class Question36 {
	static double calculate(double x1,double y1,double x2,double y2){
		double radius=6371.01;
		double d = radius * Math.acos((Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))) + (Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2))));
		return d;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input the latitude of coordinate 1: ");
		double x1=sc.nextDouble();
		
		System.out.println("Input the longitude of coordinate 1:");
		double y1=sc.nextDouble();
		
		System.out.println("Input the latitude of coordinate 2:");
		double x2=sc.nextDouble();
		
		System.out.println("Input the longitude of coordinate 2:");
		double y2=sc.nextDouble();
		
		double distance=calculate(x1,y1,x2,y2);
		
		System.out.println(distance);
sc.close();	}
}