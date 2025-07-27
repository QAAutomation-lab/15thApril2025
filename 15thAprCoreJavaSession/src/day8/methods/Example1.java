package day8.methods;

public class Example1 {

	public static void main(String[] args) {
		int num=123, rem=0,temp=0;
		System.out.println("GIven number is: "+num);
		for(;num>0;) 
		{
			rem=num%10;//3 | 2 | 1
			temp=temp*10+rem;//3 | 32 | 321
			num=num/10;//12 | 1 | 0
		}
		System.out.println("Reverse number is: "+temp);
		
		num=546;
		rem=0;
		temp=0;
		System.out.println("GIven number is: "+num);
		for(;num>0;) 
		{
			rem=num%10;//3 | 2 | 1
			temp=temp*10+rem;//3 | 32 | 321
			num=num/10;//12 | 1 | 0
		}
		System.out.println("Reverse number is: "+temp);
		
		num=759;
		rem=0;
		temp=0;
		System.out.println("GIven number is: "+num);
		for(;num>0;) 
		{
			rem=num%10;//3 | 2 | 1
			temp=temp*10+rem;//3 | 32 | 321
			num=num/10;//12 | 1 | 0
		}
		System.out.println("Reverse number is: "+temp);

	}

}
