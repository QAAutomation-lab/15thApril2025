package day10.thiskeyword;

public class Example4 {
	Example4(){
		System.out.println("I am Example4 class zero=param cons..");
	}
	int age=25;//static global variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example4 ref1=new Example4();
		ref1.display();
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
		
		//calling(); //or
		this.calling();
	}
	
	void calling() {
		System.out.println("I am calling");
	}
}
/*
this:
	its is known as current class instance
	it can be used inside nonstatic method/constructor
	using this keyword we can access any nonstatic variable/method from another nonstatic method/constructor
	mainly used to diff when non-static global variable name is same as nonstatic method local name.
*/