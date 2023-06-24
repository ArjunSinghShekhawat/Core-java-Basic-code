import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		while(true) {
			char choice;
			System.out.println("Enter '+' perform addition Operation\nEnter '-' perform subtraction operation\nEnter '*' perform multiplication operation\nEnter '/' perform divition operation\nEnter 1 for Exit this application.");
		    choice = scan.next().charAt(0);
		    
		    if(choice == '1') {
		    	break;
		    }
		    
		    System.out.println("Please Enter Number 1 and 2 :");
		    int num1 = scan.nextInt();
		    int num2 = scan.nextInt();
		    
		    switch(choice) {
		    
		    case '+':
		    	 System.out.println("Addition :"+(num1+num2));
		    	 break;
		    	 
		    case '-':
		    	 System.out.println("Subtraction :"+(num1-num2));
		    	 break;
		    	 
		    case '*':
		    	 System.out.println("Multiplication :"+(num1*num2));
		    	 break;
		    	 
		    case '/':
		    	 System.out.println("Divition :"+(num1/num2));
		    	 break;
		    	 
		    default :
		    	 System.out.println("Please Enter Valid Operator to perform specitic operation:");
		    }
		
		}
		scan.close();

	}

}
