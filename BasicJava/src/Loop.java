
public class Loop {

	public static void main(String[] args) {
		
		//for loop
		
		for(int i=0;i<5;i++) {
			System.out.println("Arjun");
		}
		
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//while loop
		int i = 0;
		while(i<5) {
			System.out.println("Arjun");
			i++;
		}
		
		int j = 0;
		while(j<5) {
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}
		
		//do while loop
		int k = 0;
		do {
			System.out.println("Arjun");
			k++;
		}while(k<5);
		
		int l = 0;
		do {
			if(l%2==0) {
			System.out.println(l);
			}
			l++;
		}while(l<5);

	}

}
