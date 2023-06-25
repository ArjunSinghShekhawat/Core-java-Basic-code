import java.util.Scanner;

class People{
	private int age;
	private String name;
	
	public void setAge(int age) {
		if(age>=18) {
			this.age = age;
		}
		else {
			System.out.println("You are not adult :");
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		if(name.length()<=4) {
			this.name = name;
		}
		else {
			System.out.println("Your name is overflow :");
		}
	}
	public String getName() {
		return name;
	}
}
public class Encapsulation2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		People obj = new People();
		
		System.out.println("Enter your name only starting  4 charactor :");
		String name = scan.next();
		obj.setName(name);
		
		System.out.println("Enter your age :");
		int age = scan.nextInt();
		obj.setAge(age);
		
		
		System.out.println("Person Name ->"+obj.getName());
		System.out.println("Person Age  ->"+obj.getAge());
		
		scan.close();
	}

}
