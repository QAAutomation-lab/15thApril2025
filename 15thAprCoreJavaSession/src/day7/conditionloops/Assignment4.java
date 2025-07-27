package day7.conditionloops;

public class Assignment4 {

	public static void main(String[] args) {
		//WAP to reverse a given number-123
		int num=1552, rem=0,temp=0, originalNum;
		originalNum=num;
		System.out.println("GIven number is: "+num);
		for(;num>0;) 
		{
			rem=num%10;//3 | 2 | 1
			temp=temp*10+rem;//3 | 32 | 321
			num=num/10;//12 | 1 | 0
		}
		System.out.println("Reverse number is: "+temp);
		
		if(originalNum==temp) {
			System.out.println("GIven number is palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
	}

}
/*
if-else:
Find Largest Among three numbers using if..else statement
Java Program to Check a Leap Year
Check if a Number is Positive or Negative using if else

for-loop:
Display Sum of n Natural Numbers
	num=5
	1+2+3+4+5=
Count Number of Digits in an Integer using for loop
Reverse a number using a for loop in Java
Java Program to Check Palindrome number
Program to Check Prime Number using a for loop
Factors of a Positive Integer
Factors of Negative Number
*/