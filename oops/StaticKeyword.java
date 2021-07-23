package oops;
import oops.A.B;
import oops.A.C;

public class StaticKeyword {

	static {
		System.out.println("Static code block 1");
	}
	
	public static void main(String[] args) {
		A objA = new A();
		B objB = objA.new B();
		C objC = new A.C();
	}
	{
		System.out.println("non ststic code block");
	}
	static {
		System.out.println("Static code block 2");
	}

}
