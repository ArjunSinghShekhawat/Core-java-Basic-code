import java.util.Scanner;

public class Numeric2 {

	public static void main(String[] args) {
		
	   Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		
		int count = 1;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<(i+1);j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		scan.close();
	}

}
