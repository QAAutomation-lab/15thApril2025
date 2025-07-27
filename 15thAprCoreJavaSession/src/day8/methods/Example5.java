package day8.methods;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printReverseNumber(123);
		printReverseNumber(564);
		printReverseNumber(10025);
	}

	public static void printReverseNumber(int num) {
		int rem=0,temp=0;
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
