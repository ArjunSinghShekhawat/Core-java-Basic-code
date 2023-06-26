import java.util.Scanner;

public class APattern {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				
				if(i==0||j==0||j==(num-1)||i==(num-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		scan.close();

	}

}
