import java.util.Scanner;

public class VariableName {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter your age :");
		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();---> suitable variable name
		int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("You are adult :");
		}
		else
		{
			System.out.println("You are not adult :");
		}
		
		
		System.out.println("Enter the cricket score :");
		int cricketScore = scan.nextInt();
		
		System.out.println("The cricket score is :"+ cricketScore);
		scan.close();
		

	}

}
