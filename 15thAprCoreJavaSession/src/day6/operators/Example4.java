package day6.operators;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=25,y,z;
		System.out.println("**************Decrement Ops*****************");
		z=x--;//post-decre
		System.out.println("x: "+x);//24
		System.out.println("z: "+z);//25
		z=--x;//pre-decre
		System.out.println("x: "+x);//23
		System.out.println("z: "+z);//23
		System.out.println("Program Ends");
	}
}
/*
pre: 1st perform the operation(increment/decrement) dn use the updated value
++x/x++ --> x=x+1;

post: 1st use the current value dn perform the operation(increment/decrement)
*/