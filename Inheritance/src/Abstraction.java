
abstract class AeroPlane1{
	
	abstract public void takeOff();
	abstract public void fly();
	public void landing() {
		System.out.println("AeroPlane is landing :");
	}
}
class CargoPlane1 extends AeroPlane1{
	
	public void takeOff() {
		System.out.println("CargoPlane requires longer runway  !");
	}
	public void fly() {
		System.out.println("CargoPlane flies at lower height !");
	}
	public void alert() {
		System.out.println("Alert.......");
	}
	
}
class PassengerPlane1 extends AeroPlane1{
	public void takeOff() {
		System.out.println("Passenger requires midium runway !");
	}
	public void fly() {
		System.out.println("Passenger flies at midium height !");
	}
	public void alert1() {
		System.out.println("Alert1.......");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		
		AeroPlane1 obj1 = new CargoPlane1();
		AeroPlane1 obj2 = new PassengerPlane1();
		
		obj1.fly();
		obj1.takeOff();
		obj1.landing();
		((CargoPlane1) obj1).alert();
		
		obj2.fly();
		obj2.takeOff();
		obj2.landing();
		((PassengerPlane1)obj2).alert1();

	}

}
