
//private data member and constructor will be not participate in inheritance.

class Student{
	int age;
//	private String name;
	String name;
	
	public Student() {
		System.out.println("Super class Constructor !");
	}
	
	
}
class Student1 extends Student{
	
//	public Student1() {
//		super();
//	}
	public void dis() {
		System.out.println("The name is :"+name);//error
		System.out.println("The age is :"+age);
	}
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		obj.dis();

	}

}
