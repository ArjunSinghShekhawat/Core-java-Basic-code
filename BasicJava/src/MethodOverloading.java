
class Cal{
    
	public int add(int a,int b) {
		return (a+b);
	}
	
	public int add(int a,int b,int c) {
		return (a+b+c);
	}
	
	public double add(double a,double b) {
		return (a+b);
	}
	
	public double add(double a,double b,double c) {
		return (a+b+c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Cal obj = new Cal();
		
		int res = obj.add(10, 23);
		int res1 = obj.add(12, 23,45);
		double res2 = obj.add(12.43, 56.76);
		double res3 = obj.add(12.34, 45.76,58.97);
		
		System.out.println("res :"+ res);
		System.out.println("res1 :"+ res1);
		System.out.println("res2 :"+ res2);
		System.out.println("res3 :"+ res3);
		
		

	}

}
