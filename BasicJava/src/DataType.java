
public class DataType {

	public static void main(String[] args) {
		
		//primitive data type
		
		byte age = 18;//1 byte 
		//byte number = 200;//error
		System.out.println("Age is :"+age);
		
		short value = 200;//2 byte
		System.out.println("Value is :"+value);
		
		int data = 1230;//4 byte
		System.out.println("Data is :"+ data);
		
		long data1 = 2345867l;//8 byte
		System.out.println("Data1 is :"+data1);
		
		float data2 = 23.45f;//4 byte
		System.out.println("Data2 is :"+data2);
		
		double data3 = 123.546467;//8 byte
		System.out.println("Data3 is :"+data3);
		
		char ch = 'a';//2 byte
		System.out.println("Ch is :"+ch);
		
		boolean isTrue = true;//1 byte
		System.out.println("isTrue is :"+isTrue);
		
		
		//question 
		byte num1 = 10;
		byte num2 = 20;
		//byte result = num1+num2;//error
		int result = num1+num2;
		System.out.println(result);
		
		short val = 20;
		short val1 = 30;
		int res = val + val1;
		//short res = val + val1;//error

		System.out.println(res);
		
		float num3 = 34.65f;
		float num4 = 65.78f;
		float result1 = num3+num4;
		System.out.println(result1);
	}

}
