package day6.operators;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=25,y,z;
		y=x+50;
		System.out.println("x: "+x);//25
		System.out.println("y: "+y);//75
		System.out.println("**************Increment Ops*****************");
		z=++x;//pre-increment ++x --> x=x+1
		System.out.println("x: "+x);//26
		System.out.println("z: "+z);//26
		z=x++;//
		System.out.println("x: "+x);//27
		System.out.println("z: "+z);//26
		System.out.println("Program Ends");
	}
}
/*
pre: 1st perform the operation(increment/decrement) dn use the updated value
++x/x++ --> x=x+1;

post: 1st use the current value dn perform the operation(increment/decrement)
*/