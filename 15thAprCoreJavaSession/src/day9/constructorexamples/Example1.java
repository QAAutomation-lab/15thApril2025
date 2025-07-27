package day9.constructorexamples;

public class Example1 {

	static int num1=25;
	double num2=56;
	void calling() {
		System.out.println("I am calling on "+num2);
	}
	void calling(int num) {
		System.out.println("I am calling on "+num);
	}
	static void display() {
		System.out.println("I am displaying "+num1);
	}
	static void display(int num) {
		System.out.println("I am displaying "+num);
	}
	public static void main(String[] args) {
		display();
		Example1 ref=new Example1();
		ref.calling();
		double sum=num1 + ref.num2;
		System.out.println("Sum is: "+sum);

	}
}
