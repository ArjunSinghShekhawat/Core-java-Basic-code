
public class Increment_Dcrement_Operator {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		
		num = num++ - num++;//11-12->-1
		System.out.println(num);
		
		int num1 = 20;
		
		num1 = num1++ + ++num1 - num1-- - --num1;//20+22-22-20
		System.out.println(num1);
		
		
	   int num2 = 20;
	   
	   num2 = num2++ + ++num2 + num2++ - num2 - num2--;
	   
	   System.out.println(num2);
	   
		
		
		

	}

}
