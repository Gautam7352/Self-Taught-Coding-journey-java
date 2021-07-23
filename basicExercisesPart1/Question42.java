package basicExercisesPart1;

import java.util.Scanner;

/*42. Write a Java program to input and display your password. 
Expected Output

Input your Password:                                                    
Your password was: abc@123*/
class Question42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input your password: ");
		String k=sc.next();
		System.out.println("Your password= "+k);
sc.close();	

	}

}
