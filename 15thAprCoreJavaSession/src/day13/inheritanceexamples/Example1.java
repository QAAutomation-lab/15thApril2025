package day13.inheritanceexamples;
class Test1{
	void calling() {
		System.out.println("I am calling from Test1");
	}
	static void display() {
		System.out.println("I am displaying from Test1");
	}
}
class Test2{
	void demo() {
		System.out.println("I am demo from Test2");
	}
	static void sample() {
		System.out.println("I am Sample from Test2");
	}
}
public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		//accessing non-static members
		Test1 ref1=new Test1();
		ref1.calling();
		Test2 ref2=new Test2();
		ref2.demo();
		Example1 ref3=new Example1();
		ref3.show();
		//accessing static members
		Test1.display();
		Test2.sample();
		Example1.magic();
		System.out.println("Program ends");
	}
	void show() {
		System.out.println("I am show from Example1");
	}
	static void magic() {
		System.out.println("I am magic from Example1");
	}

}
