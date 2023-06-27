package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException{
		
		File dir = new File("Family");
		
		File file = new File(dir,"arjun");
		
		FileReader fr = new FileReader(file);
		
		char ch[] = new char[(int)file.length()];
		
		fr.read(ch);
		
		for(char data:ch) {
			System.out.println(data);
		}

	}

}
