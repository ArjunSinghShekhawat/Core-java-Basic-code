
import java.util.Scanner;
public class If_elseif {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks :");
		int marks = scan.nextInt();
		
		if(marks>=90) {
			System.out.println("A++:");
		}
		else if(marks>=80) {
			System.out.println("A:");
		}
		else if(marks>=70) {
			System.out.println("B:");
		}
		else if(marks>=60) {
			System.out.println("C:");
		}
		else if(marks>=50) {
			System.out.println("D:");
		}
		else if(marks>=36) {
			System.out.println("E:");
		}
		else {
			System.out.println("F:");
		}
		scan.close();

	}

}
