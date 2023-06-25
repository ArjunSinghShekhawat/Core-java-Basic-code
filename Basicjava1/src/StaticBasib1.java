
class Student{
	static int a;
	static int b;
	
	static {
		a = 90;
		b = 89;
	}
	
	static void dis() {
		System.out.println("The value of a is :"+a);
		System.out.println("The value of b is :"+b);
		
	}
}
public class StaticBasib1 {

	public static void main(String[] args) {
		
		Student.dis();
		Student obj = new Student();
		obj.dis();

	}

}
