package IO;
import java.io.*;

public class MakeDirFile {

	public static void main(String[] args) {
		
		File file1 = new File("arjun1.txt");
		
		//System.out.println(file1.exists());//false
		//System.out.println(file1.isFile());//false
		
		try {
		
			if(file1.createNewFile()) {
				System.out.println("File successfull create :");
			}
			else {
				System.out.println("File is already exists in this directory : ");
			}
		}
		catch(Exception e) {
			System.out.println("Un expected error is occurred :");
		}
		
		System.out.println(file1.exists());

	}

}
