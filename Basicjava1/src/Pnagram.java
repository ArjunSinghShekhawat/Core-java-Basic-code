public class Pnagram {

	public static void main(String[] args) {
		
		String name = "mnbvcxzlkjhgfdsaqwertyuiopaaaaaazzzzz";
		
		//replace all white space
		name = name.replace(" ", "");
		
		//Convert upper case 
		name = name.toUpperCase();
		
		//convert charector array
		char ch[] = name.toCharArray();
		
		int arr[] = new int[26];
		boolean flag = true;
		for(int i=0;i<ch.length;i++) {
			arr[ch[i]-65]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
		}
		for(int value:arr) {
			System.out.print(value+" ");
		}
		
		if(flag) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not panagram ");
		}
		
		
		
		
		
		
		
		

	}

}
