package day22.exceptionhandling;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=10,y=0,z;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		try {
			System.out.println("********** Try block started *******");
			z=x/y;//abnormal statement --> this will terminate program execution
			System.out.println("z: "+z);
			System.out.println("********** Try block ends *******");
		}catch(ArithmeticException e) {
			System.out.println("********** catch block started *******");
			System.out.println("Exception handled");
			e.printStackTrace();//complete exception in console
			System.out.println("********** catch block ends *******");
		}
		System.out.println("Program Ends");
	}
}
