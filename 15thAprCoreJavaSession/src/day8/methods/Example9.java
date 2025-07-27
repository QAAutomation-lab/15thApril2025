package day8.methods;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		//method body will be executed and we can store its return value into a variable for future use
		int res=getReverseNumber(num);
		System.out.println("Reverse number is: "+res);
		
	}
	public static double getReverseNumber() {
		int num=123;
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

	public static int getReverseNumber() {
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
}
/*
can we do overloading by change return type only?
	- No

*/