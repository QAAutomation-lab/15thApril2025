package day4.variables;
public class Example10 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		//declare & initialize
		int num1=10;
		int num2=20;
		int result=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Addition of number1 & number2 is: "+result);
		//perform subtraction, re-initialization of result variable
		result=num2-num1;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("subtraction of number1 & number2 is: "+result);
		//perform multiplication, re-initialization of num1, num2 & result variable
		num1=50;
		num2=10;
		result=num1*num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("multiplication of number1 & number2 is: "+result);
		//perform division, re-initialization result variable
		result=num1/num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("division of number1 & number2 is: "+result);
		//perform MOD, re-initialization of num1, num2 & result variable
		num1=67;
		num2=3;
		result=num1%num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("division of number1 & number2 is: "+result);
		System.out.println("Program ends");
	}
}
/* 
number/number=number
15/4=3

floatingPointNumber/number=floatingPointNumber
15.0/4=3.75

number/floatingPointNumber=floatingPointNumber
15/4.0=3.75
 */
