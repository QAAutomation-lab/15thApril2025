package day5.variabletypes;

public class Example7 
{
	//Global variables
	int x=25;//non-static global variable
	double y;//non-static global variable

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		int num1=14;//local variable
		System.out.println("local variable num1: "+num1);
			
		Example7 ref=new Example7();
		System.out.println("Nonstatic varible x: "+ref.x);
		System.out.println("Nonstatic varible y: "+ref.y);
		ref.y=150;
		System.out.println("updated, Nonstatic varible y: "+ref.y);
		
		Example7 ref2=new Example7();
		System.out.println("ref2, Nonstatic varible x: "+ref2.x);
		System.out.println("ref2, Nonstatic varible y: "+ref2.y);
		ref2.x=500;
		ref2.y=50000.56;
		System.out.println("updated ref2, Nonstatic varible x: "+ref2.x);
		System.out.println("updated ref2, Nonstatic varible y: "+ref2.y);
		
		Example7 ref3=new Example7();
		System.out.println("ref3, Nonstatic varible x: "+ref3.x);
		System.out.println("ref3, Nonstatic varible y: "+ref3.y);
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
 * 				* any global variable declared without static keyword known as non-static global variable
 *				* there variable will be loaded into the memory at the time of execution when instance/object of a class is
 *				  created hence they are also known as instance/object variable
 *				* these variable will have multiple memory allocation depends on instance/object creation
 *				* Object: is a real word entity that has its own behavior or property, to load nonstatic member of the
 *				  class 1st you need create an instance/object like-
 *							classname refvariable;//object declaration
 *							refvariable = new classname();//object initialization
 *									//or
 *							classname refvariable=new classname();
 *				* once object/instance is created now you can access non-static member
 *					- you can access non-static member from another non-static member directly
 *					- STD: you should use instance of the class to access them like
 *							refvariable.nonstaticvariablename;
 *				* you can use these variable without initialization in that case you will default value based on datatype
 *				* once the object is created any modification won;t impact another object
 */