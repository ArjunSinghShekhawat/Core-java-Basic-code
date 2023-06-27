package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadOperation {

	public static void main(String[] args)throws IOException {
		
		File dir = new File("Family");
		
		File file = new File(dir,"arjun");
		
		FileReader fe = new FileReader(file);
		
		int i = fe.read();
		
		while(i != -1) {
			System.out.print(i+"------>");
			System.out.println((char)i);
			i = fe.read();
		}

	}

}
