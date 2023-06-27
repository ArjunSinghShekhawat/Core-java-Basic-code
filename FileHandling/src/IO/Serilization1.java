package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	
	
	int age;
	String name;
	
	public Student1(int age,String name) {
		this.age = age;
		this.name = name;
	}	
}
public class Serilization1 {

	public static void main(String[] args)throws IOException {
		
		Student1 obj = new Student1(21,"arjun");
		
		FileOutputStream fos = new FileOutputStream("Family/arjun");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		
		System.out.println("Successfull");
		
	}

}
