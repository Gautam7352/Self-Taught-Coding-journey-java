  package inheritance;
/*Inheritance is property in java which allows us to inherit properties from on class to other class almost same as nesting:
* any child has only one class as parent at any particular level but may have multiple parents in the hierarchial levels where any individual parent can have any number of children 
* 
 */
 class Main {
	 /* Method overriding: First we defined an eat method in Person class then we again defined eat method in Teacher and Singer classes.
	  * This enabled us to first create a default derivable value in person class then we re-defined which over-rides the previous method to give it specific new features
	  */

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		
		t.name = "Mr. Harry";
		t.eat();// eat is over-ridden method
		t.walk();
		t.teach();
		
		Singer s = new Singer();
		
		s.name="Oprah";
		s.sing();
		s.eat();// eat is over-ridden method
		
		
		
		//Upcasting 
		// We have tried to assign a teacher object to person class. We can do so because Teacher is a person and so we can expect properties of person in a teacher object
		Person P = t;//Implicit casting or Up Casting
		
		//Downcasting
		Teacher t1=new Teacher();	//Created t1 teacher object
		Person p = t1;	// Associating t1 with person p
		
		Singer s1 = new Singer();	//Created s1 teacher object
		Person k =s1;	// Associating s1 with person k
		
		Teacher t2 = (Teacher)p;	//downcasting object P to teacher
		
				
		
		boolean y= t2 instanceof Teacher;
		
		System.out.println(t1 instanceof Teacher);
		System.out.println(s1 instanceof Singer);
		System.out.println(t1 instanceof Person);
		
		System.out.println(t instanceof Person);
		System.out.println(p instanceof Singer);
	}

}
