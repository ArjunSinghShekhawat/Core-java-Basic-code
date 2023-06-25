
class Test{
	private int age;
	private String name;
	private int roll;
	
	public Test() {
		
		this("rohan",22,501);
		System.out.println("Default Constructor !");
		this.name = "arjun";
		this.age = 21;
		this.roll = 3;
	}
	public Test(String name) {
		System.out.println("One perameterize constructor !");
		this.name = name;
		
	}
	
	public Test(String name , int age) {
		this("mukesh");
		System.out.println("Two perameterize constructor !");
		this.name = name;
		this.age = age;
	}
	
	public Test(String name, int age,int roll) {
		this("rakesh",22);
		
		System.out.println("Three perameterize constructor !");
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	
	void dis() {
		System.out.println("Name   ->"+name);
		System.out.println("Age    ->"+age);
		System.out.println("Roll   ->"+roll);
	}
}
public class ConstructorOverload {

	public static void main(String[] args) {
		
		Test obj1 = new Test();
		obj1.dis();
		
		Test obj2 = new Test("rahul");
		obj2.dis();
		
		Test obj3 = new Test("narpat",26);
		obj3.dis();
		
		Test obj4 = new Test("manjeet",17,25);
		obj4.dis();

	}

}
