package day24.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example3 {

	public static void main(String[] args) throws IOException {
		/**
		 * Step1: First find the location where you have stored property file
		 * Location:
		 * 		absolute location: starting from the root till the target element
		 * 			i.e: F:\\Workplaces\\CoreJava_Workspace\\15thAprCoreJavaSession\\testdata\\AppData.properties
		 * 							//or
		 * 				 F:/Workplaces/CoreJava_Workspace/15thAprCoreJavaSession/testdata/AppData.properties
		 * 		
		 * 		relative location: starts from middle till the target element
		 * 			i.e: .\testdata\AppData.properties
		 * 			where '.' indicates current working directory
		 * 		String currentDir=System.getProperty("user.dir");
		 */
//		String fileLoc=".\\testdata\\AppData.properties";
		String fileLoc="./testdata/AppData.properties";
		//Step2: Create an instance of FileInputStream class and pass the property file location to its constructor.
		FileInputStream fis=new FileInputStream(fileLoc);
		//Step3: Create an instance of Properties class
		Properties prop=new Properties();
		//step4: With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
		prop.load(fis);
		//Step5: Call getProperty(key) of Properties class to read data from property file
		System.out.println("Name: "+prop.getProperty("username"));
		System.out.println("Password: "+prop.getProperty("password"));
		System.out.println("Email: "+prop.getProperty("email"));
	}

}
/*
#Steps to read data from property file:

First find the location where you have stored property file
Create an instance of FileInputStream class and pass the property file location to its constructor.
Create an instance of Properties class
With the help of properties reference variable call load() properties class and pass
     FileInputStream class reference to this method
Call getProperty(key) of Properties class to read data from property file
*/