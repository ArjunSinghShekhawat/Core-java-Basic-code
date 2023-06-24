
public class MutableStringMethodPreDfi {

	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer();
		
		System.out.println(name.capacity());//16
		
		name.append("aqwsxcderfvbgtyhr");
		System.out.println(name.capacity());
		
		StringBuffer name1 = new StringBuffer("arjun");
		
		System.out.println(name1.capacity());//21
		name1.setCharAt(0, 'A');
		System.out.println(name1);
		
		System.out.println(name1.length());
		
		
		

	}

}
