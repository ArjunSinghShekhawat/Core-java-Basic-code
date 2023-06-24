
public class CompareString {

	public static void main(String[] args) {
		
		String name1 = "arjun";
		String name2 = "arjun";
		
		System.out.println(name1.equals(name2));
		System.out.println(name1 == name2);
		
		String name3 = new String("arjun");
		String name4 = new String("Arjun");
		
		System.out.println(name3.equalsIgnoreCase(name4));
		System.out.println(name3 == name4);

	}

}
