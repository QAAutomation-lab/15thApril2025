package day9.constructorexamples;

public class Example4 {

	Example4(){
		System.out.println("I am user defined zero param cons..");
		num2=55.56;
	}
	static int num1=25;
	double num2;
	void calling() {
		System.out.println("I am calling on "+num2);
	}
	public static void main(String[] args) {
		Example4 ref=new Example4();
		ref.calling();
		double sum=num1 + ref.num2;
		System.out.println("Sum is: "+sum);

	}
}
/*
constructor:
* it is similar to a method
* but its same should be same as classname and it won't return any value to JVM.
* its used to initialize non-static member(variables+method) of class when instance/object is created.
* a copy of non-static members will be loaded into the newly created object memory.
* type:
   i. default: 
   			* this is written by java compiler only if the class doesn;t have any type of constructor   
      		* this doesn't contains any argument and its body will be impity
   ii. user defined:
   			* a constructor written by java programmer will be known as user defined constructor
*/