import java.util.Scanner;

public class ReverseString {
	public static char[] reverse(String name) {
		
		char ch[] = name.toCharArray();
		
		
		for(int i=0;i<ch.length/2;i++) {
		   char temp = ch[i];
		   ch[i] = ch[ch.length-1-i];
		   ch[ch.length-1-i] = temp;
			
		}
		return ch;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name :");
		String name = scan.nextLine();
		
		System.out.println(reverse(name));
		
		scan.close();

	}

}
