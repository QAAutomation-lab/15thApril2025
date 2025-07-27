package day6.operators;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=25,y,z;
		y= x++ + ++x + x + x++ + x--;
//initial: 25  + 27 + 27 + 27  + 28
//final  : 26    27   27   28    27
		z= y + ++y + y-- + --y + y--;
//initial:134 +135 + 135 + 133 + 133
//final  :134  135   134   133   132
		System.out.println("x: "+x);//27
		System.out.println("y: "+y);//132
		System.out.println("z: "+z);//
		System.out.println("Program Ends");
	}
}
/*
pre: 1st perform the operation(increment/decrement) dn use the updated value
++x/x++ --> x=x+1;

post: 1st use the current value dn perform the operation(increment/decrement)

-20 + -1=
*/