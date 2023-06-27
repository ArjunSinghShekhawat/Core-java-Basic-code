package IO;

import java.io.File;

public class DirInFile {

	public static void main(String[] args) throws Exception {
		
     	File dir = new File("D://pwJava Folder/BasicJava/src");
//		
//		System.out.println(dir.isDirectory());
//		
//		dir.mkdir();
//		
//		System.out.println(dir.isDirectory());
//		
//		File file1 = new File(dir,"arjun");
//	
//		System.out.println(file1.isFile());
//		file1.createNewFile();
//		
//		System.out.println(file1.exists());
//		
//		File file2 = new File(dir,"manjeet");
//		file2.createNewFile();
		
		int count = 0;
		
		String files[] = dir.list();
		
		for(String value:files) {
			count++;
			System.out.println(value);
		}
		System.out.println("Total files is :"+count);
		
		

	}

}
