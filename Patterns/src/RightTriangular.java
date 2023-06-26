import java.util.Scanner;

public class RightTriangular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		
		
		for(int i=0;i<num;i++) {
			//space
			for(int space = 0;space<(num-1-i);space++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<(i+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();

	}

}
