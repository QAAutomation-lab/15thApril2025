package day9.constructorexamples;

public class Example6 {

	int num1;
	double num2;
	Example6(){
		System.out.println("I am zero-param cons..");
	}
	Example6(int num){
		System.out.println("I am int-param cons..");
		num1=num;
	}
	Example6(double n,int x){
		System.out.println("I am double-int-param cons..");
		num1=x;
		num2=n;
	}
	public static void main(String[] args) {
		Example6 ref1=new Example6(25);
		System.out.println("ref1, num1: "+ref1.num1);//25
		System.out.println("ref1, num2: "+ref1.num2);//0.0
		
		Example6 ref2=new Example6(75.66,25);
		System.out.println("ref2, num1: "+ref2.num1);//75.66
		System.out.println("ref2, num2: "+ref2.num2);//25
		
		Example6 ref3=new Example6();
		System.out.println("ref3, num1: "+ref3.num1);//0
		System.out.println("ref3, num2: "+ref3.num2);//0.0
	}
}
/*
 * with constructor overloading we can initialize each object with diff values based on need
 * 
 * 
 */
