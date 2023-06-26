class Student5{
	String name = "arjun";
	int age = 21;
	
	
	public void dis() {
		System.out.println("The name is :"+name);
		System.out.println("The age is :"+age);
	}
}
class Student6 extends Student5{
	
}
class Student7 extends Student6{
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Student7 obj = new Student7();
		obj.dis();

	}

}
