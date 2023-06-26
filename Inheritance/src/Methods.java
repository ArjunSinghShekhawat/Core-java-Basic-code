
class Test1{
	//overeaden method
	public void dis1() {
		System.out.println("Hy i am arjun :");
	}
	//inherited method
	public void dis2() {
		System.out.println("Hy i am manjeet :");
	}
	
}
class Test2 extends Test1{
	//override method
	public void dis1() {
		System.out.println("Hy i am not arjun :");
	}
	//specilize method
	public void dis3() {
		System.out.println("Hy i am rekha :");
	}
}
class Test3 extends Test1{
	
	//override method
	public void dis1() {
		System.out.println("Hy i am not again arjun :");
	}
	//specilize method
	public void dis4() {
		System.out.println("Hy i am narpat :");
	}
}
public class Methods {

	public static void main(String[] args) {
		 Test1 obj = new Test3();
		 
		 obj.dis1();
		 obj.dis2();
          
	}

}
