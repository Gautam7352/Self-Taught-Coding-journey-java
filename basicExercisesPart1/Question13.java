package basicExercisesPart1;
/*Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
import java.util.*;
class Question13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float Width=sc.nextFloat();
		float Height=sc.nextFloat();
		float Area=2*(Width+Height);
		System.out.println("Area of rectangle = "+Area);
sc.close();	}

}
