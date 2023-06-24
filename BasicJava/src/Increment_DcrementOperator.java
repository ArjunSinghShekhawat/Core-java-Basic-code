
public class Increment_DcrementOperator {

	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println("Num will be :"+num);
		
		num++;
		
		System.out.println("Num will be :"+num);
		
		num--;
		
		System.out.println("Num will be :"+num);
		
		++num;
		
		System.out.println("Num will be :"+num);
		
		--num;
		
		System.out.println("Num will be :"+num);
		
		int data = 10;
		
		data = data++ + ++data + --data - data-- + ++data;//10+12+11-11+11
		
		System.out.println("Data will be :"+data);
	}

}
