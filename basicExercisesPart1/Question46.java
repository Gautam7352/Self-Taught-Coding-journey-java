package basicExercisesPart1;
/*46. Write a Java program to display the system time. 
Sample Output:

Current Date time: Fri Jun 16 14:17:40 IST 2017 */
class Question46 {

	public static void main(String[] args) {
		System.out.format("Current date and time: %Tc%n\n",System.currentTimeMillis());
	}
}
