
public class TypeCasting {

	public static void main(String[] args) {
		
		//Type Casting
		
		//1. Implicit type casting
		
		int data = 657;
		double val;
		val = data;
		System.out.println(val);
		
		//2. Explicit type Casting
		double data1 =54.765;
		int val1;
		val1 = (int)data1;
		System.out.println(val1);
		
		//Example
		int num1 = 12;
		int num2 = 5;
		float res = num1/num2;
		
		System.out.println(res);
		System.out.println(12.0/5);//float
		System.out.println(12.0/5.0);//float
		System.out.println(12.45678/24.8);//double
		

	}

}
