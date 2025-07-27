package day10.thiskeyword;

public class Example2 {
	int age=25;//static global variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example2 ref1=new Example2();
		ref1.display();
		System.out.println("Program Ends");
	}
	
	Example2(){
		System.out.println("I am Example2 class zero=param cons..");
	}

	void display() {
		System.out.println("I am Non-Static method display, age is: "+age);
		int age=75;
		System.out.println("Age: "+age);
		
		Example2 e1=new Example2();
		System.out.println("NSGV age: "+e1.age);
	}
}
