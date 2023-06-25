
class Demo{
	int age;
	String name;
	
	public Demo() {}
	public Demo(String name,int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name ->"+name);
		System.out.println("Age  ->"+age);
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		
		Demo obj = new Demo("arjun", 22);
		obj.display();
		
		Demo obj1 = new Demo();
		obj1.display();
		

	}

}
