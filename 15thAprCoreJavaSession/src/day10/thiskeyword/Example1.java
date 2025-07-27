package day10.thiskeyword;

public class Example1 {
	static int age=25;//static global variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		display();
		System.out.println("SGV age: "+age);
		int age=58;//local variable
		System.out.println("Age: "+age);
		System.out.println("SGV age: "+Example1.age);
		Example1.age=75;
		display();
		System.out.println("Program Ends");
	}

	static void display() {
		System.out.println("I am Static method display, age is: "+age);
	}
}
