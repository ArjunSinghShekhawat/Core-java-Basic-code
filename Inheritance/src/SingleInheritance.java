
class Student3{
	int age;
	String name;
	
	public void sleep() {
		System.out.println("Arjun is sleep :");
	}
	
}
class Student4 extends Student3{
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Student4 obj = new Student4();
		obj.sleep();
		

	}

}
