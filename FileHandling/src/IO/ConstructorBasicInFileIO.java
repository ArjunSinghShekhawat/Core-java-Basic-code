package IO;

class Student{
	int age;
	String name;
	int roll;
	
	public Student(String name,int age,int roll) {
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Name = "+name+" |Age = "+age+" |Roll "+roll;
	}
	
}
public class ConstructorBasicInFileIO {

	public static void main(String[] args) {
		
		Student obj = new Student("arjun", 20, 201);
		System.out.println(obj);
		
		
		Student obj1 = new Student("manjeet", 17, 210);
		System.out.println(obj1);
		

	}

}
