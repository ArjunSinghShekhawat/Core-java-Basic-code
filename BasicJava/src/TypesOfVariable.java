
public class TypesOfVariable {

	//instance Variable
	int age = 21;
	String name = "arjun";
	public static void main(String[] args) {
		
		//local variable
		int num = 10;
		
		TypesOfVariable obj = new TypesOfVariable();
		TypesOfVariable obj1 = new TypesOfVariable();
		
		obj.name = "rahul";
		obj.age = 25;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
        obj1.name = "manjeet";
        obj1.age = 17;
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		System.out.println(num);
		
		

	}

}
