public class DataType {

	public static void main(String[] args) {
		
		//Primitive data type
		
		
		//1.Whole number 
		
		//byte -> 1byte = 8 bits
		byte data = 20;
		System.out.println("byte -> "+data);
		
		//short -> 2byte = 16 bits
		short data1 = 400;
		System.out.println("short ->"+data1);
		
		//int -> 4byte = 32 bits
		int data2 = 4957;
		System.out.println("int -> "+data2);
		
		//long -> 8byte = 64 bits
		long data3 = 7465836L;
		System.out.println("long -> "+data3);
		
		//2. Real Number 
		
		//float -> 4byte = 32bits
		float data4 = 485.76f;
		System.out.println("float ->"+data4);
		
		//double -> 8byte = 64bits
		double data5 = 54.7623454;
		System.out.println("double ->"+data5);
		
		//3. Character
		
		//char -> 2byte = 16bits
		char ch = 'a';
		System.out.println("char ->"+ch);
		
		//4.boolean -> 1byte = 8bits
		boolean isTrue = true;
		System.out.println("boolean ->"+isTrue);
		
		
		//operation
		byte val1 = 10;
		byte val2 = 20;
//		byte ans = val1 + val2; -->error
		int ans = val1 + val2;
		System.out.println(ans);
		

	}

}
