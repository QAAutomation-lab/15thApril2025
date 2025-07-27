package day4.variables;
public class Example9 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
//		int num1=10;
//		int num2=20;
//		int result=num1+num2;
		
		//when you have to declare same type of multiple variables dn use this
//		int num1,num2,result;
//		num1=10;
//		num2=20;
//		result=num1+num2;
		
		//when you have to declare & initialize same type of multiple variables dn use this
		int num1=10,num2=20,result=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Addition of number1 & number2 is: "+result);
		System.out.println("Addition of number1 & number2 is: "+(num1+num2));
		System.out.println("Addition of number1 & number2 is: "+num1+num2);
		System.out.println(num1+"+"+num2+"="+result);
		System.out.println("Program ends");
	}
}
/* 
 datatype variablename=value;
 
 x=10
 y=20
 z=x+y
 
 num1+"+"+num2+"="+result
      10+
      10+num2+"="+result
 */
