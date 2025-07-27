package day6.operators;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=25,y,z;
		y=x++; //y=25; x=26
		z=++x; //z=27; x=27
		System.out.println("x: "+x);//27 
		System.out.println("y: "+y);//25
		System.out.println("z: "+z);//27
		
		x=-20;
		y=--x; //y=-21 x=-21
		z=x--; //z=-21 x=-22
		System.out.println("x: "+x);//-22
		System.out.println("y: "+y);//-21
		System.out.println("z: "+z);//-21
		System.out.println("Program Ends");
	}
}
/*
pre: 1st perform the operation(increment/decrement) dn use the updated value
++x/x++ --> x=x+1;

post: 1st use the current value dn perform the operation(increment/decrement)

-20 + -1=
*/