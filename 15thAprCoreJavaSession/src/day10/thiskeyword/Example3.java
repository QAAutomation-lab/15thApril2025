package day10.thiskeyword;

public class Example3 {
	int age=25;//static global variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example3 ref1=new Example3();
		ref1.display();
		System.out.println("ref1 value is: "+ref1);
		System.out.println("Program Ends");
	}

	void display() {
		System.out.println("I am Non-Static method display, age is: "+age);
		int age=75;
		System.out.println("Age: "+age);
		
//		Example3 e1=new Example3();
//		System.out.println("NSGV age: "+e1.age);
				//or
		System.out.println("NSGV age: "+this.age);
		System.out.println("this keyword values is: "+this);
	}
}
/*
this:
	its is known as current class instance
	it can be used inside nonstatic method/constructor
	using this keyword we can access any nonstatic variable/method from another nonstatic method/constructor
	mainly used to diff when non-static global variable name is same as nonstatic method local name.
*/