package IO;

import java.io.File;

public class MakeDir {

	public static void main(String[] args) {
		
		File dir = new File("Manjeet");
		
		System.out.println(dir.exists());
		
		dir.mkdir();
		System.out.println(dir.exists());
	}

}
