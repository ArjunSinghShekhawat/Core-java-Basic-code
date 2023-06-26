
/* final*/ class Parent{
	final int age = 25;
	final String name = "arjun";
	
	 final public void dis() {
		System.out.println("Name - "+name);
		System.out.println("Age  - "+age);
	}
}
class Child extends Parent{
//	public void dis() {
//		
//	}
	
}
public class FinalKeyword {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.dis();
		

	}

}
