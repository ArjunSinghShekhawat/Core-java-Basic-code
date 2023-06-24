
public class AnnymousArray {
	
	public static void Display(int arr[]) {
		for(int data:arr) {
			System.out.print(data+" ");
		}
	}
	public static void Display1(int arr[]) {
		for(int data:arr) {
			System.out.print(data+" ");
		}
	}

	public static void main(String[] args) {
		
//		int num[] = {1,2,3,4,5};
		
		Display(new int[]{11,2,3,4,5});
		System.out.println();
		Display1(new int[]{11,22,33,42,5});

	}

}
