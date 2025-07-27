package day8.methods;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Sample1 ref=new Sample1();
		ref.addition();
		
		ref.additionOftwoNumber(25, 75);
		
		//method body will be executed but its return value won't be printed in the console
		//ref.getReverseNumber(5689);
		
		
		//method body will be executed and also its return value will be printed in console
		//System.out.println("Reverse number is "+ref.getReverseNumber(num));
						//or
		//method body will be executed and we can store its return value into a variable for future use
		int res=ref.getReverseNumber(258);
		System.out.println("Reverse number is: "+res);
		System.out.println("Program Ends");
	}
	
	public int getReverseNumber(int num) {
		int rem=0,temp=0;
		System.out.println("GIven number is: "+num);
		for(;num>0;) 
		{
			rem=num%10;//3 | 2 | 1
			temp=temp*10+rem;//3 | 32 | 321
			num=num/10;//12 | 1 | 0
		}
		return temp;
	}
	
	void addition() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
		//return;
	}
	
	void additionOftwoNumber(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
	}
}
/*
method contains set of repetitive statements and these statements will be executed when method is called

*/