package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOperation {

	public static void main(String[] args) throws IOException{
		
		File dir = new File("Family");
		
		System.out.println(dir.exists());
		
		File file = new File(dir,"arjun");
		System.out.println(file.exists());
		
		FileWriter fw = new FileWriter(file,true);
		fw.write("\n");
		fw.write("i am arjun");
		fw.write("\n");
		fw.write(65);
		fw.write("\n");
		char ch[] = {'a','r','j','u','n'};
		fw.write(ch);
		fw.write("\n");
		fw.write("hyyyy");
		fw.write("\n");
		
//		fw.close();
		fw.flush();
		
		System.out.println("Write Operation SuccessFully execute ");

	}

}
