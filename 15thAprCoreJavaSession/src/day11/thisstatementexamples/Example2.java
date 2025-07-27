package day11.thisstatementexamples;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
//		Example2 r3=new Example2();
//		Example2 r1=new Example2(25);
		Example2 r2=new Example2(20,36);		
		System.out.println("Program ends");
	}

	Example2(){
		System.out.println("I am zero-param cons...");
	}
	Example2(int num){
		this();
		System.out.println("I am int-param cons...");
	}
	Example2(double num1, int num2){
		this(25);
		System.out.println("I am double-int-param cons...");
	}
}

/*
this()
	its also know as current class instance
	its use to call another constructor of current class based on the parameter
	it will be used only inside the constructor
	it should be/must be the 1st statement inside the constructor body
*/