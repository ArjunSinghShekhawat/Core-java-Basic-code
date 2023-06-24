import java.util.Scanner;

public class _2DArrayBasic {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[0][2] = 13;
		arr[1][0] = 14;
		arr[1][1] = 15;
		arr[1][2] = 16;
		arr[2][0] = 17;
		arr[2][1] = 18;
		arr[2][2] = 19;
		
		for(int value[]:arr) {
			for(int data:value) {
				System.out.print(data+" ");
			}
			System.out.println();	
		}
		
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row :");
		int row = scan.nextInt();
		
		System.out.println("Enter the coloum :");
		int coloum = scan.nextInt();
		
		int value[][] = new int[row][coloum];
		
		System.out.println("Enter array element :");
		
		for(int i=0;i<value.length;i++) {
			for(int j=0;j<value[i].length;j++) {
				value[i][j] = scan.nextInt();
			}
		}
		System.out.println("Display the array element :");
		for(int data[]:value) {
			for(int num:data) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
        scan.close();
	}

}
