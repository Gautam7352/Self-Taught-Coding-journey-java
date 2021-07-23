package encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.name="Joe";
		obj.setAge(15);
	System.out.println(obj.getAge());
	}

}
