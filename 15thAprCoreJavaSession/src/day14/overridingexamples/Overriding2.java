package day14.overridingexamples;
class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
	void display() {
		System.out.println("I am display() of Animal2 class");
	}
}
class Dog2 extends Animal2 {
	public void move() {
		System.out.println("Dogs can walk and run");
		display();
		// Animal2 a1 = new Animal2();//instance of Animal2 class
		// a1.move(); //or
		super.move();		
	}
}
public class Overriding2 {

	public static void main(String args[]) {
		Animal2 b = new Dog2(); // Animal reference but Dog object
		b.move(); //
	}
}
/*
private ---> method can't overrided, because they are visible/accessible within a class body
default ---> while overriding we can user either default or protected or public
protected ---> while overriding we can user either protected or public
public---> while overriding we can user either public


Debugging: executing program line by line
	1. add break point into required step
	2. use below mentioned shortcut to execute program step by step
		* F6: to move to next line
		* F5: to go inside the method body
		* F8: to continue program execution
		* ctrl+shft+i:  to check variable or method return value	
*/