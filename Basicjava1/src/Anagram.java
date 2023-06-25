import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		
		String name = "keep raja";
		String name1 = "peek jaa";
		
		name = name.replace(" ", "");
		name1 = name1.replace(" ", "");
		
		name = name.toUpperCase();
		name1 = name1.toUpperCase();
		
		char ch1[] = name.toCharArray();
		char ch2[] = name1.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
