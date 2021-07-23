package encapsulation;

public class Student {
		String name;		// this variable is public so it can be used anywhere in the package
		private int age;	// this variable is private so it can be used on in the class Student
// since age is private and cannot be used everywhere so we need to make getters and setters method in order to make it accessible to certain specific places that we decide


//since age is private variable under student class and we need to use it outside our class so we make getter and setter public
		
		// function to get age
		public int getAge() {
			return age;
		}
		
		// function to set age
		public void setAge(int age) {
			if(age>20) {
				System.out.println("You are too old to be a student");
			}else
			this.age=age;
		}

}
  