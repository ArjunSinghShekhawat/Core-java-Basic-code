package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferConcept {

	public static void main(String[] args)throws IOException {
		
		File dir = new File("Family");
		File file = new File(dir,"arjun");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
	     char ch[] = new char[(int)file.length()];
	     
	     br.read(ch);
	     
	     for(char data:ch) {
	    	 System.out.println(data);
	     }
		

	}

}
