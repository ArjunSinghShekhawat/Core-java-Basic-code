
class Student101{
	
	private Heart hea;
	
	Student101(Heart hea){
		this.hea = hea;
	}
	public void setHeart(Heart hea) {
		this.hea = hea;
	}
	public void start() {
		hea.heartBit();
	}
	
}
class Heart{
	public void heartBit() {
		System.out.println("Heart is important :");
	}
}
public class HasA {

	  public static void main(String[] args) {
		
       Heart obj = new Heart();
       Student101 obj1 = new Student101(obj);//constructor injuction//dependency injection//loose coupling
       obj1.setHeart(obj);
       obj1.start();
	}

}
