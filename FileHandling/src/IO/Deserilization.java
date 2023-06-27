package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Class implements Serializable{
	int age;
	transient String name;
	int roll;
	
	public Class(String name,int age,int roll) {
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	public void dis() {
		System.out.println("Name :"+name);
		System.out.println("Age  :"+age);
		System.out.println("Roll :"+roll);
	}
}
public class Deserilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Class obj = new Class("arjun",21,501);
//		obj.dis();
//		
		File file = new File("Family/arjun");
//		FileOutputStream fos = new FileOutputStream(file);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		ObjectOutputStream oos = new ObjectOutputStream(bos);
//		
//		oos.writeObject(obj);
//		
//		oos.flush();
//		oos.close();
//		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Class obj = (Class) ois.readObject();
		obj.dis();
		
		System.out.println("Successfully :");
		
		

	}

}
