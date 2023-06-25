
public class ReverseString {

	public static void main(String[] args) {
		
		String name = "pw java";
		String ans[] = name.split(" ");
		
		for(String value:ans){
			
			for(int i = value.length()-1;i>=0;i--) {
				System.out.print(value.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
