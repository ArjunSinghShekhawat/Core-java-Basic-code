
public class StringInBuiltMethod {

	public static void main(String[] args) {
		
		String name = "arjun";
		
		System.out.println("Length ->"+name.length());
		System.out.println("Char at index->"+name.charAt(2));
		System.out.println("index of ->"+name.indexOf('j'));
		System.out.println("Sub Set ->"+name.substring(1,3));
		System.out.println("Upper Case ->"+name.toUpperCase());
		System.out.println("Sub string ->"+name.substring(1));
		System.out.println("Sub String ->"+name.substring(2,4));
		System.out.println(name.lastIndexOf('u'));
		

	}

}
