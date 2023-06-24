
public class JaggedArray {

	public static void main(String[] args) {
		
		int num[][] = new int[3][];
		
		num[0] = new int[5];
		num[1] = new int[7];
		num[2] = new int[10];
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int value[]:num) {
			for(int val:value) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
	}

}
