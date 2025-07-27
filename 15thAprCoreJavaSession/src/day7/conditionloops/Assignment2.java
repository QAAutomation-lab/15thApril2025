package day7.conditionloops;

public class Assignment2 {

	public static void main(String[] args) {
//		int counter=0;
//		for(int num=123;num>0;num=num/10) {
//			counter++;
//		}
		
		int num=123,counter=0;
		System.out.println("Given number is: "+num);
		for(;num>0;) {
			counter++;//1  | 2 | 3
			num=num/10;//12| 1 | 0
		}
		System.out.println("Number of digits: "+counter);
	}

}
/*
for-loop:
Display Sum of n Natural Numbers
	num=5
	1+2+3+4+5=
Count Number of Digits in an Integer using for loop
	123
	
Reverse a number using a for loop in Java
 num=123
Java Program to Check Palindrome number
 num=121
Program to Check Prime Number using a for loop
 num=
Factors of a Positive Integer
Factors of Negative Number
*/