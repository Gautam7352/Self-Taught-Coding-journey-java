package basicExercisesPart1;
import java.util.Scanner;
/*Q11. Write a Java program to print the area and perimeter of a circle. 
 Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
class Question11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double r=sc.nextDouble();
		double Perimeter =2*Math.PI*r;
		double Area = Math.PI*Math.PI*r;
		System.out.println("Perimeter is = "+Perimeter);
		System.out.println("Area is = "+Area);
sc.close();}

}
