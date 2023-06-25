
public class StaticBasic2 {
	
	static int a;
	static int b;
	
	int m;
	int n;
	
	static {
		a = 10;
		b = 20;
	}
	{
		m = 100;
		n = 200;
	}
	
	static void dis1() {
		System.out.println("The value of a is :"+a);
		System.out.println("The value of b is :"+b);
	}
	
	 void dis2() {
		System.out.println("The value of m is :"+m);
		System.out.println("The value of n is :"+n);
	}

	public static void main(String[] args) {
		
		StaticBasic2 obj = new StaticBasic2();
		obj.dis2();
		StaticBasic2.dis1();
		
		
		

	}

}
