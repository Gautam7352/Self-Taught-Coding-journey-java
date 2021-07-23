package methodsORfunction;

class introduction {
// only one public class can be made in a package
	public static void main(String[] ax) {
		/*public<1> static<2> int<3> methodName<4>(int a, int b<5>) {
			//body<6>
		}
		1> Modifier- It defines the access type of the method and is optional to use.
		2> static: 
		3> Return type of method
		4> Name of method. The method signature consists of method name and parameter list.
		5> Parameter list: Gives you defining parameters of the method with it's datatype.
		6> Body: It defines what method does with a statement.
		** Main section of code is also a method of a public class.
		*/
		
		// Number comparison using method.
		String t="0";
		int a=5;int b=785;
		int result=maxOf(a,b);	// this is method calling. write method name and in bracket give it's parameters.
		int l=maxOf(2,4);
		sayHi();
		sayHi(t);
		System.out.println(result+" "+l+" ");
	}
	
	static int maxOf(int a, int b) {
		if(a>b)
			return a;
		else 
			return b;
	}
	
	static void sayHi() 
	{
		System.out.println("Hello world");
	}

	//method overloading: two different methods can be written with same name if they have different signatures i.e. dataypes used
	 
	static void sayHi(String k) {
		k="Bonjour";
		System.out.println(k);
	}
}

/*We can pass parameters in functions by following two ways:
 * 1. Pass by value: The method parameter values are copied to another variable and then copied object is passed, that's why it's called pass by value.
 * 2. Pass by reference: An alias or reference to the actual parameter is passed to the method, that's why it's called pass by reference.
 */
 