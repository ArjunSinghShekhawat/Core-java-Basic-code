package IO;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {
		
		File file1 = new File("D://pwJava Folder/BasicJava/src");
		
		System.out.println(file1.exists());
		
	
			if(file1.exists()) {
				System.out.println("The name of the file :"+file1.getName());
			    System.out.println("Get absolute path of the file "+file1.getAbsolutePath());
			    System.out.println("Check file writable :"+file1.canWrite());
			    System.out.println("Check file Readable :"+file1.canRead());
			    System.out.println("Size of file in length :"+file1.length());
			}
			else {
				System.out.println("The file is not exits:");
			}
	}

}
