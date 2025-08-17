package day2.jsonAndSerializationPojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	String name="Pune";
	int empId=101;;
	Demo(){
		System.out.println("I am Demo class cons....");
	}
}
public class Selenium {

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println("name: "+d1.name);
		System.out.println("empId: "+d1.empId);
		
		String fileName="MyObject.ser";
		
		try {
			//Identifying location to store Serialized object
			FileOutputStream fos=new FileOutputStream(fileName);
			//Creating instance of ObjectOutputSteam 
			ObjectOutputStream out=new ObjectOutputStream(fos);
			//using writeObject() store object into file
			out.writeObject(d1);
			out.close();
			fos.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//once you Serialized object, dn after that if you do any change in the object that won't impact Serialized object
		d1.name="Advik";
		d1.empId=505;
		System.out.println("name: "+d1.name);
		System.out.println("empId: "+d1.empId);
		
		Demo d2=null;
		try {
			FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis);
			d2=(Demo)ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println("EmpId: "+d2.empId);
			System.out.println("Name: "+d2.name);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
