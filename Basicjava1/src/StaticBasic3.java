import java.util.Scanner;

class Farmer{
	double pa;
	double time;
	static double rate;
	double si;
	
	static {
		rate = 8.5;
	}
	
	Scanner scan = new Scanner(System.in);
	void input() {
		System.out.println("Enter principal amount :");
		pa = scan.nextDouble();
		
		System.out.println("Enter time required :");
		time = scan.nextDouble();
		
	}
	
	void compute() {
		si = (pa*time*rate)/100;
		
	}
	void display() {
		System.out.println("The simple interest will be :"+ si);
	}
}
public class StaticBasic3 {

	public static void main(String[] args) {
		
		Farmer p1 = new Farmer();
		p1.input();
		p1.compute();
		p1.display();
		
		Farmer p2 = new Farmer();
		p2.input();
		p2.compute();
		p2.display();
		
		Farmer p3 = new Farmer();
		p3.input();
		p3.compute();
		p3.display();
		

	}

}
