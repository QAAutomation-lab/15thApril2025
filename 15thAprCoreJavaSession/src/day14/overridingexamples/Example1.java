package day14.overridingexamples;
class Sample{
	void calling() {
		System.out.println("Calling you from Sample class");
	}
}
public class Example1 extends Sample{
	@Override
	void calling() {
		System.out.println("Calling you from Example1 class");
	}
	public static void main(String[] args) {
		Example1 ref=new Example1();
		//ref.calling();
		ref.display();
	}
	
	void display() {
		System.out.println("I am display from Example1");
		calling();
		
//		Sample r1=new Sample();
//		r1.calling();
		//or
		super.calling();
	}
}
/*
Overriding:
	when you are trying to declare a method in child class but that method is already present in parent class
	dn that method will be known as overrided method
	this is possible only when classes are involve in inheritance(IS-A)
	possible only with non-static method
	
	not possible:
		- constructor overriding not possible
		- static method overriding not possible
		- private method overriding is not possible
		- by changing only argument type not possible
		- variable can;t be overrided
*/