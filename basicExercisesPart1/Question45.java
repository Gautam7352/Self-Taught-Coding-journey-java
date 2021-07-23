package basicExercisesPart1;

import java.io.File;

/*45. Write a Java program to find the size of a specified file. 
Sample Output:

/home/students/abc.txt  : 0 bytes                                      
/home/students/test.txt : 0 bytes */
class Question45 {

	public static void main(String[] args) {
		System.out.println("D:\\\\java.Practice Patterns.pdf "+new File("D:\\java.Practice Patterns.pdf").length()+" bytes");
		

	}

}
