
import java.util.Scanner;
public class If_else {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("You are adult:");
		}
		else {
			System.out.println("Your are not adult:");
		}
		scan.close();

	}

}
