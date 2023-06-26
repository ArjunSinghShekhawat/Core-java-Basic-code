
abstract class AeroPlane{
	
	abstract public void takeOff();
	abstract public void fly();
	
}
class CargoPlane extends AeroPlane{
	
	public void takeOff() {
		System.out.println("CargoPlane required longer runway !");
	}
	public void fly() {
		System.out.println("CargoPlane flies at low height !");
	}
	
}
class PassengerPlane extends AeroPlane{
	public void takeOff() {
		System.out.println("PassengerPlane required midium runway !");
	}
	public void fly() {
		System.out.println("PassengerPlane flies at low midium !");
	}
}
class Aeroport{
	public void poly(AeroPlane ref) {
		ref.takeOff();
		ref.fly();
	}
}

public class Polymorphisam {

	public static void main(String[] args) {
		
		AeroPlane obj = new CargoPlane();
		AeroPlane obj1 = new PassengerPlane();
		Aeroport ref = new Aeroport();
		
		ref.poly(obj);
		ref.poly(obj1);
	}

}
