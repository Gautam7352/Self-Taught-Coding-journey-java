package inheritance;

 class Person 
{
	protected String name;// protected keyword is used only when we intend it to pass on to it's children class and none else
	
	public void walk()
	{
		System.out.println(name +" is walking");
	}
	
	public void eat()

	{
		System.out.println(name+ " is eating");
	}
}
