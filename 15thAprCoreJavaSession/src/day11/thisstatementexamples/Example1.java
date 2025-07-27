package day11.thisstatementexamples;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example1 r1=new Example1(25);
		Example1 r2=new Example1(20,36);
		Example1 r3=new Example1();
		System.out.println("Program ends");
	}

	Example1(){
		System.out.println("I am zero-param cons...");
	}
	Example1(int num){
		System.out.println("I am int-param cons...");
	}
	Example1(double num1, int num2){
		System.out.println("I am double-int-param cons...");
	}
}
