
class Car{
	
	private Engine eng;
	
	public Car(Engine eng) {
		this.eng = eng;
	}
	public void start() {
		eng.engineStart();
	}
	
	
}
class Engine{
	public void engineStart() {
		System.out.println("Engine Started :");
	}
}
public class HasA1 {

	public static void main(String[] args) {
		
		Engine ref = new Engine();
		Car obj = new Car(ref);
		obj.start();

	}

}
