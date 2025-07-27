package day22.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=10,y=0,z;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		z=x/y;//abnormal statement --> this will terminate program execution
		System.out.println("z: "+z);
		System.out.println("Program Ends");
	}
}
/*
Exception:

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day22.exceptionhandling.Demo.main(Demo.java:10)

where: 
	msg: / by zero
	exception name: ArithmeticException
*/