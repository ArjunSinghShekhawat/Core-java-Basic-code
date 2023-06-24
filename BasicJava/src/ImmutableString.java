
public class ImmutableString {

	public static void main(String[] args) {
		
		String name = "rekha";
		name = name.concat(" singh");
		
		String name1 = new String("Narpat");
		name1 = name1.concat(" shekhawat");
		
		System.out.println(name);
		System.out.println(name1);

	}

}
