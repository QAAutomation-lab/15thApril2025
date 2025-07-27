package day6.operators;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=-5,num2=-10;
		boolean res;
		res=(num1==num2);
		System.out.println("num1==num2: "+res);//or
		System.out.println("num1==num2: "+(num1==num2));//f
		System.out.println("num1!=num2: "+(num1!=num2));//t
		System.out.println("num1>num2: "+(num1>num2));//t
		System.out.println("num1<num2: "+(num1<num2));//f
		System.out.println("num1>=num2: "+(num1>=num2));//t
		System.out.println("num1<=num2: "+(num1<=num2));//f
		System.out.println("Program Ends");
	}
}
/*
num1==num2--->false
num1!=num2--->true
num1>num2---->false
num1<num2---->true
num1>=num2--->false
num1<=num2--->true
*/