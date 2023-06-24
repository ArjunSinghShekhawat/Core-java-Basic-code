
import java.util.Scanner;
public class GetLengthStrng {

	public static int getLength(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
	public static void main(String[] args) {
		
		String name;
		
		char c[] = {'a','\0','r','j'};
		
		System.out.println(c);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		name = scan.nextLine();
		
		
		int length = getLength(name);
		System.out.println("The length of name is :"+ length);
		
		scan.close();

	}

}
