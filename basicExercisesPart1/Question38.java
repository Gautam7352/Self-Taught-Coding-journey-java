package basicExercisesPart1;
/*38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. 
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6*/
class Question38 {

	public static void main(String[] args) {
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		char[] a=test.toCharArray();
		int alphabets=0;
		int space=0;
		int digit=0;
		int other=0;
		for(int i=0;i<a.length;i++) {
			if(Character.isAlphabetic(a[i]))
				alphabets++;
			else if(Character.isSpaceChar(a[i]))
				space++;
			else if(Character.isDigit(a[i]))
				digit++;
			else other++;
		}
		System.out.println("Total alphabets in the string: "+alphabets);
		System.out.println("Total spaces in the string: "+space);
		System.out.println("Total digits in the string: "+digit);
		System.out.println("Other characters: "+other);
}
}
