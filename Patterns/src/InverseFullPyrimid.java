import java.util.Scanner;

public class InverseFullPyrimid {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		
		for(int i=0;i<num;i++){
			//space 
			for(int space = 0;space<i;space++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<(num-i);j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}

}
