import java.util.Scanner;

public class _1DArrayBasic {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		arr[0] = 1;
		arr[1] = 22;
		arr[2] = 45;
		arr[3] = 76;
		arr[4] = 76;
	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
       String name[] = new String[5];
       
       name[0] = "arjun";
       name[1] = "manjeet";
       name[2] = "pooja";
       name[3] = "rahul";
       name[4] = "narpat";
       
       for(String value:name) {
    	   System.out.print(value+" ");
       } 
       System.out.println();
       char ch[] = new char[5];
       ch[0] = 'a';
       ch[1] = 'r';
       ch[2] = 'j';
       ch[3] = 'u';
       ch[4] = 'n';
       
       for(char value:ch) {
    	   System.out.print(value+" ");
       }
       System.out.println();
       
       double marks[] = new double[5];
       
       marks[0] = 9.5;
       marks[1] = 6.5;
       marks[2] = 8.3;
       marks[3] = 7.5;
       marks[4] = 10.0;
       
       
       for(double value:marks) {
    	   System.out.print(value+" ");
       }
       
       boolean isBest[] = new boolean[5];
       
       isBest[0] = true;
       isBest[1] = false;
       isBest[2] = false;
       isBest[3] = true;
       isBest[4] = false;
       
       System.out.println();
       for(boolean value:isBest) {
    	   System.out.print(value+" ");
       }
       
       int num[] = {11,22,33,44,55};
       
       System.out.println();
       for(int value:num) {
    	   System.out.print(value+" ");
       }
       
       Scanner scan = new Scanner(System.in);
       int data[] = new int[5];
       
       for(int i=0;i<data.length;i++) {
    	   data[i] = scan.nextInt();
       }
       System.out.println("Display the array element :");
       for(int value:data) {
    	   System.out.print(value+" ");
       }
       scan.close();
       

	}

}
