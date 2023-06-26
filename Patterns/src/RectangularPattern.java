import java.util.Scanner;

public class RectangularPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the row number :");
		int row = scan.nextInt();
		
		System.out.println("Enter the coloum number :");
		int col = scan.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
            scan.close();
	}

}
