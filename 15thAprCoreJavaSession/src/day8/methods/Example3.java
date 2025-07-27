package day8.methods;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		addition();
		Example3.addition();
		addition();
		Example3.addition();
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
}
/*
method contains set of repetitive statements and these statements will be executed when method is called

*/