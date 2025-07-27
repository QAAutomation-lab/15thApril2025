package day10.thiskeyword;

public class Example5 {
	int age;
	Example5(int age){
		System.out.println("local Age: "+age);//25
		this.age=age;//globalvariable = localvariable;
		System.out.println("NSGV Age: "+this.age);//25
		System.out.println("local Age: "+age);//25
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example5 ref=new Example5(25);
		ref.calling();
		System.out.println("Program ends");
	}
	
	void display() {
		System.out.println("I am display of Example5");
		//calling();
		// or
		this.calling();
	}
	
	void calling() {
		System.out.println("I am calling of Example5");
	}

}
