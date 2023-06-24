
public class StringPrectice {

	public static void main(String[] args) {
		
		//immutable string
		String name = "arjun";
		String name1 = new String(" singh");
		
		System.out.println("Name will be :"+ name);
		System.out.println("Name will be :"+ name1);
		
		String s1 = "singh";
		String s2 = "singh";
		
		System.out.println(s1==s2);//true
		
		String s3 = new String("singh");
		String s4 = new String("singh");
		
		System.out.println(s3==s4);//false
		
		String value = "singh";
		String value1 = new String("SINGH");
		
		System.out.println(value.equals(value1));
		
		System.out.println(value.equalsIgnoreCase(value1));
		
		//mutable string
		StringBuffer a1 = new StringBuffer("rajput");
		StringBuilder a2 = new StringBuilder("rajput");
		
		System.out.println(a1);
		System.out.println(a2);
		
		//concat
		String data = "arjun";
		System.out.println(data);
		data = data.concat(" singh");
		System.out.println(data);
		
		String val = "singh";
		String val1 = "shekhawat";
		String val2;
		
		val2 =  "pw"+"java"+101+204+val1;
		System.out.println(val2);
		val = val1+val2;
		System.out.println(val);
		
		//append
		StringBuffer data1 = new StringBuffer("manjeet");
		System.out.println(data1);
		data1.append(" singh");
		System.out.println(data1);
		
		//final Keyword
		final StringBuffer na = new StringBuffer("Singh");
		na.append(" raj");
		System.out.println(na);
		
		//na = new StringBuffer("Munna");//error
		
		//predefine Method
		String temp = "arjun singh";
		
		//length
		System.out.println(temp.length());
		
		//toUpperCase
		System.out.println(temp.toUpperCase());
		
		//toLowerCase
		System.out.println(temp.toLowerCase());
		
		//charAt
		System.out.println(temp.charAt(1));
		
		//indexOf
		System.out.println(temp.indexOf('a'));
		
		StringBuffer ma = new StringBuffer("shekhawat");
		
		//setCharAt
		ma.setCharAt(0,'S');
		System.out.println(ma);
		
		//capacity
		System.out.println(ma.capacity());

		//length()
		System.out.println(ma.length());
		
		//sub string
		System.out.println(ma.substring(0,3));

	}

}
