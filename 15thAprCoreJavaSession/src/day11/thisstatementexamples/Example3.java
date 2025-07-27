package day11.thisstatementexamples;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
//		Example3 r3=new Example3();
		Example3 r1=new Example3(25);
//		Example3 r2=new Example3(20,36);		
		System.out.println("Program ends");
	}

	Example3(){
		this(25.36,10);
		System.out.println("I am zero-param cons...");
	}
	Example3(int num){
		this();
		System.out.println("I am int-param cons...");
	}
	Example3(double num1, int num2){
		System.out.println("I am double-int-param cons...");
	}
}

/*
PS
	double-int
	zero
	int
PE
*/