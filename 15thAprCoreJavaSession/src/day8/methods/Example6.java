package day8.methods;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		//getReverseNumber(num);//method body will be executed but its return value won't be printed in the console
				//or
			
		//method body will be executed and also its return value will be printed in console
		//System.out.println("Reverse number is "+getReverseNumber(num));
				//or
		//method body will be executed and we can store its return value into a variable for future use
		int res=getReverseNumber(num);
		System.out.println("Reverse number is: "+res);
		
	}

	public static int getReverseNumber(int num) {
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
Method with void return type won't return any value to JVM
where method with other then void return type, will return value and that value will be stored in method itself
so in order get that value in console print that method or store that value into another variable of method return type


*/