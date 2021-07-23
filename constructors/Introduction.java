package constructors;


class Vehicle{
	int headlights;
	int wheels;
	int driver;
	String colour;
// parameterized constructor: This constructor initializes created object without any default value using variables. We just have to provide parameter value during object creation
	Vehicle (int noOfWheels,int driver){
		wheels=noOfWheels;
		headlights=2;
// This keyword is used to refer to currently created object 
		this.driver=driver;
	}
//Constructor overloading: You can create multiple constructors with same name in case parameter signature  is not similar.
	// Suppose you know colour of a vehicle then you will create another constructor with same name and a color parameter
	Vehicle(int noOfWheels,int driver, String colour){
		this.colour = colour;
		wheels=noOfWheels;
		headlights=2;
		this.driver=driver;
	}
}


public class Introduction {
	// No arguement constructors: If any constructor does not have any parameters that define it then it is No arguement constructor
	Introduction(){
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
/*	Constructor is different from methods as constructors does not have any return type whereas methods do.
 * Furthermore, name of constructors should be same as the names of class.
 * Syntax is same as method.
 * When an object is called it's constructor is always called.
 */
		Introduction obj=new Introduction();
		Vehicle car=new Vehicle(4,1);
		Vehicle Scooter=new Vehicle(2,1);
		
		Vehicle Ferrari=new Vehicle(4, 1, "Red");
		
		System.out.println(obj);
		System.out.println(car.wheels+" wheels on car 1 and "+ Scooter.wheels +" wheels on car 2");
		System.out.println("Ferrari has "+Ferrari.colour+"colour "+Ferrari.wheels+"wheels");
}
}
//Default constructor: If no specific constructor is defined in a class then a default constructor is made by the compiler with empty values to initialize variables in the class