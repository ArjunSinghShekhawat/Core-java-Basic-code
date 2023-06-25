
class Student1{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
public class Encapsulation1 {

	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		obj.setName("arjun");
		obj.setAge(20);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
