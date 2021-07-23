package oops;
//There can be only one public class in a package
class Cat{
	//States or properties of class
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	//method
	public void walk(){
	System.out.println("Cat is walking");	
	}
	
	public void eat() {
	System.out.println("Cat is eating");	
	}

	public void description() {
	System.out.println("Cat has " + legs + " legs  " + eyes + " eyes");
	}
}


class Dog{
	int legs;
	int tail;
	public void jump() {
		System.out.println("Dog is jumping");
	}
	
	public void description() {
		System.out.println("Dog has " + legs +" legs " + tail + " tail");
	}
}
public class Introduction {

	public static void main(String[] args) {
//	Steps of OOPS
//						Encapsulation
//					Abstraction
//				Polymorphism
//			Inheritance
//		Class
//	Objects
		  		  
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.eyes=4;
		cat1.legs=4;
		cat2.eyes=2;
		cat2.legs=4;
		
		cat1.description();
		cat1.walk();
		cat2.description();
		cat2.eat();
		System.out.println();System.out.println();
		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.legs=4;
		husky.tail=1;
		husky.jump();
		husky.description();
		poodle.legs=4;
		poodle.tail=1;
		poodle.jump();
		poodle.description();
		
	}

}
