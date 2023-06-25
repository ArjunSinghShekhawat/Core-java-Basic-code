
public class Palindrome {

	public static void main(String[] args) {
		
		String name = "madam";
		boolean flag = true;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) != name.charAt(name.length()-1-i)) {
				System.out.println("Not palindrome:");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Palindrome :");
		}

	}

}
