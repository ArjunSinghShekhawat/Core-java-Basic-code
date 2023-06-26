class Student10{
	String name= "arjun";
	int age = 20;
	
	void dis() {
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
	}
}
class Student11 extends Student10{
	
}
class Student12 extends Student10{
	
}
class Student13 extends Student10{
	
}
public class hierarchyInheritance {

	public static void main(String[] args) {
		Student13 obj = new Student13();
		obj.dis();

	}

}
