package day8.methods;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		addition(25.56f,36.36,25);
		System.out.println("Program Ends");
	}
	static void addition() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
		//return;
	}
	static void addition(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
	}
	
	static void addition(float a,double b) {
		double c;
		c=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
	}
	
	static void addition(double a,double b, int c) {
		double res;
		res=a+b+c;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
	}
	static void addition(int a,double b, double c) {
		double res;
		res=a+b+c;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
	}
}
/*
Method overloading: with this we can implement same logic in diff ways
	when we declare one method more then once in a class with same name but diff argument/parameter then 
	that method will be known as overloaded method
		diff argument/parameter
			- diff type of argument  //or
			- diff number of argument //or
			- diff in position of argument
*/