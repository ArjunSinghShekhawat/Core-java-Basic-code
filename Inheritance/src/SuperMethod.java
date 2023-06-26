
class Demo{
	int age;
	String name;
	Demo(){
		System.out.println("Parent class Constructor :");
	}
	Demo(int age,String name){
		this();
		System.out.println("Two parameterize constructor :");
	}
}
class Demo1 extends Demo{
	
	Demo1(){
		super(12,"arjun");
		System.out.println("Child class Default constructor :");
	}
	Demo1(int age){
		System.out.println("Child class One paraneterize constructor");
	}
	
}
public class SuperMethod {

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		

	}

}
