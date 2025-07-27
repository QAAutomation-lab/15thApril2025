package day8.methods;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		addition(10,20);
		addition(50,60);
		addition(75,25);
		addition(100,25);
		System.out.println("Program Ends");
	}
	static void addition(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
	}
}
/*
method contains set of repetitive statements and these statements will be executed when method is called

method with argument/parameter:
	when you want to execute your method everytime with diff set of data them use parameter/argument
	
*/