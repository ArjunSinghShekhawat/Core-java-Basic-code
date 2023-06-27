package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

class Student2 implements Serializable{
	int age;
	transient String name;
	float per;
	
	public Student2(String name,int age,float per){
		this.name = name;
		this.age = age;
		this.per = per;
	}
	public void dis() {
		System.out.println("Name        ->"+name);
		System.out.println("Age         ->"+age);
		System.out.println("Persantage  ->"+per);
	}
	
}
public class Prectice1 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		
		//create directory
//		File dir = new File("B.tech");
//		
//		dir.mkdir();
		
		/***********************/
		//serilization
		
//		Student2 obj = new Student2("arjun", 12, 87.12f);
//		obj.dis();
//		
//		File dir = new File("B.tech");
//		File csFile = new File(dir,"CsData.txt");
//		
//		FileOutputStream fos = new FileOutputStream(csFile);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		ObjectOutputStream oos = new ObjectOutputStream(bos);
//		
//		oos.writeObject(obj);
//		oos.flush();
//		oos.close();
		
//		
//		FileInputStream fis = new FileInputStream(csFile);
//		BufferedInputStream bis = new BufferedInputStream(fis);
//		ObjectInputStream ois = new ObjectInputStream(bis);
//		
//		Student2 obj = (Student2)ois.readObject();
//		obj.dis();
//		
//
//		ois.close();
		
		//create file
//		
//		File csFile = new File(dir,"CsData.txt");
//		csFile.createNewFile();
//		
//		File civilFile = new File(dir,"CivilData.txt");
//		civilFile.createNewFile();
//		
//		File eeFile = new File(dir,"ElectricalData.txt");
//		eeFile.createNewFile();
//		
//		File meFile = new File(dir,"MechanicalData.txt");
//		meFile.createNewFile();
//		
//		
//		FileWriter fwCs = new FileWriter(csFile);
//		BufferedWriter bwCs = new BufferedWriter(fwCs);
//		PrintWriter pwCs = new PrintWriter(bwCs);
//		
//		FileWriter fwCivil = new FileWriter(civilFile);
//		BufferedWriter bwCivil = new BufferedWriter(fwCivil);
//		PrintWriter pwCivil = new PrintWriter(bwCivil);
//		
//		
//		pwCs.println("*********************Cs Department*******************");
//		
//		pwCs.println("Student Name                -> Arjun Singh ");
//		pwCs.println("Student Age                 -> 21");
//		pwCs.println("Student Marks In First Sem  -> 85%");
//		
//		pwCs.println("-----------------------------------");
//		
//		pwCs.println("Student Name                -> Anshu Singh ");
//		pwCs.println("Student Age                 -> 19");
//		pwCs.println("Student Marks In First Sem  -> 81%");
//		
//		pwCs.println("-----------------------------------");
//		
//		pwCs.println("Student Name                -> Govind Verma ");
//		pwCs.println("Student Age                 -> 22");
//		pwCs.println("Student Marks In First Sem  -> 95%");
//		
//		
//		pwCs.close();
//		
//		pwCs.println("*********************Civil Department*******************");
//		
//		pwCivil.println("Student Name                -> Rahul Singh ");
//		pwCivil.println("Student Age                 -> 18");
//		pwCivil.println("Student Marks In First Sem  -> 80%");
//		
//		pwCivil.println("-----------------------------------");
//		
//		pwCivil.println("Student Name                -> Rakesh Singh ");
//		pwCivil.println("Student Age                 -> 20");
//		pwCivil.println("Student Marks In First Sem  -> 70%");
//		
//		pwCivil.println("-----------------------------------");
//		
//		pwCivil.println("Student Name                -> Vipin Verma ");
//		pwCivil.println("Student Age                 -> 22");
//		pwCivil.println("Student Marks In First Sem  -> 57%");
//		
//		pwCivil.close();
//		
//		//Read Operation
//		FileReader fr = new FileReader(csFile);
//		BufferedReader br = new BufferedReader(fr);
//		
//		String line = br.readLine();
//		
//		while(line!=null) {
//			System.out.println(line);
//			line = br.readLine();
//		}
//		//civil
//		
//		FileReader fr1 = new FileReader(civilFile);
//		BufferedReader br1 = new BufferedReader(fr1);
//		
//		
//		String line1 = br1.readLine();
//		
//		while(line1!=null) {
//			System.out.println(line1);
//			line1 = br1.readLine();
//		}
//		
//		
		
		//count file
		int count = 0;
		File dir = new File("B.tech");
		String name[] = dir.list();
		
		for(String value:name) {
			System.out.println(value);
			count++;
		}
		System.out.println("The Numer of file will be :"+count);
		
		System.out.println("All Successfull");	
	}

}
