package basicExercisesPart1;
//Q91. Write a Java program to measure how long some code takes to execute in nanoseconds.
class Question91 {

	public static void main(String[] args) {
		long a=System.nanoTime();
		for(int i=0;i<10;i++)System.out.println("Hello world");
		long b=System.nanoTime();
	System.out.println("Program execution time in nano seconds: "+(b-a));
	System.out.println("Program execution time in seconds: "+(float)(b-a)/1000000000);
	}
}
