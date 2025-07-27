package day4.variables;
public class Example11 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2=10,num3;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		//System.out.println("Number3: "+num3);// compile time error as its not initialized
		System.out.println("Program ends");
	}
}
/*
 * Local variable must be initialized before we use them otherwise you will get compile time error
 * Local variable won;t get separate memory to store
 * 
 */
