package day5.variabletypes;

public class Example3 
{
	//Global variables
	static int x=25;//static global variable
	static double y;//static global variable

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		int num1=14;//local variable
		System.out.println("local variable num1: "+num1);
		System.out.println("STD Global varibale x: "+Example3.x);
		System.out.println("STD Global varibale y: "+Example3.y);
		System.out.println("Program ends");
	}

}
/*
 * Type of variables:
 * 	1. Local variable: a variable declared inside method/constructor body is known as local variable
 * 		- these variable can't be access from out side the method/constructor body
 * 		- Local variable must be initialized before we use them otherwise you will get compile time error
 * 		- Local variable won;t get separate memory to store
 * 		- these variable can't be declared as static
 * 	
 *  2. Global variable: a variable declare outside the method/constructor body but present in class body is known as global variable
 * 		- these variables can be access from anywhere depending on types
 * 		- these variables will get separate memory allocation for storage purpose
 * 		- you can use these variable without initialization in that case you will default value based on datatype
 * 			byte, short, int, long will have default value as '0'
 * 			float & double will have default value as '0.0'
 * 			char will have default value as ' '
 * 			boolean will have default value as false
 * 		Types:
 * 			a. static global variable/class variable
 * 				* any global variable declared with static keyword known as static global variable
 * 				* these variables will be loaded in the memory at the time of compilation when .class file is getting loaded
 * 				* hence these variables are also known as class variables
 * 				* these variable will have one time memory allocation
 * 				* you can use these variable without initialization in that case you will default value based on datatype
 * 				* to access these variable from anywhere we can follow anyone process mentioned below
 * 					- you can directly access static variable from anywhere
 * 					- STD: you should use classname while access these variables like-
 * 						classname.staticglobalvariablename;
 * 			b. non-static global variable/instance variable
 * 
 */