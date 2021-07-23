package strings;

class Introduction {

	public static void main(String[] args) {
		/*Strings are an array of characters.
		 * It is non-primitive data type or a class in java package.
		 *Character  denoted by: 'A'
		 *String denoted by:   "~a 3k$" or "@"
		 */
		String name="Gautam";	// String initialization by literal. 
		String anotherName = new String("Dragix");//String declaration by new object of class String.
		/*When strings are initialized by literals i.e. normal declarations of variable with data type string,
		 * instead of storing Strings in normal memory i.e. Heap memory, Java developers decided to store Strings in "String pool area"
		 * "String pool area" performs caching of strings, i.e. if a particular string is already available in the memory,
		 *  	then instead of giving new variable the extra space in memory for new value it assigns already available string to the variable that made request.
		 *  
		 *  When strings are initialized by new creating new objects, 
		 *  New memory space is allocated to the string in heap area (and also in string pool area if it is not already available) even if it is available in the heap area.
		 *   Same as space is provided to any new object.
		 */
		// To verify above theory, following test is done i.e. literal and object declaration are compared for equality.
		String name2=new String("Gautam");
		System.out.println(name==anotherName);
		System.out.println(name2.charAt(2));// Gives character at position
//Strings are immutable, i.e. certain stored value is not changed in the memory rather new value is created for it. If any string becomes unusable then it is considered garbage value.

/*Functions from strings class:
 * 1.  variable.charAt(position): Gives character at given position.
 * 2.  variable.length(): Gives length of character.
 * 3.  variable.substring(beginning index): it prints every value from beginning character without spaces.
 * 4.  variable.substring(x,y-1): it prints every value from x up-to y-1.
 * 5.  variable.contains(CharSequence s): Gives output if character is contained in the variable or not.
 * 6.  variable.equals(variable to be compared with): Compares current values of compared variables.
 * 7.  variable.isEmpty(): Gives if variable is empty or not.
 * 8.  variable.concat(value in bracket): Used to perform concatenation of string in bracket to the value of variable
 * 9.  variable.replace('val1','val2'): Replaces val1 from variable with val2.
 * 10. variable.split(regex): splits whole variable when regex is encountered.(use for each loop to do it for whole string)
 * 11. variable.indexOf(character): Gives index of character in string variable.
 * 12. variable.toLowerCase(): Turns all characters of variable to lower case.
 * 13. variable.toUpperCase(): Turns all characters of variable to upper case.
 * 14. variable.trim(): Removes all the spaces in the beginning and end.
 */	
		
	}

}
