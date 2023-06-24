
public class TernaryOperator {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 30;
		
		int res1 = (num2>num1)?num2:num1;
		
		System.out.println("Result :"+res1);
		
		int num3 = 40;
		
		int res2 = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
		 
		System.out.println("Result 1 :"+ res2);

	}

}
