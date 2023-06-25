
public class Staticbasic {
	
	static int age;
	static String name;
	
	static {
		System.out.println("Static block !");
		age = 18;
		name = "arjun singh";
	}
	
	static void display() {
		System.out.println("Your name is  :"+name);
		System.out.println("Your age is :"+age);
		}

	public static void main(String[] args) {
		
		display();
		
	}

}
