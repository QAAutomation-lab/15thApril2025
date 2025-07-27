package day20.predefinedclasses2;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=scn.nextInt();
		System.out.println("Actual number is: "+num);
		System.out.println(getReverseNumber(num));
		

	}

	static int getReverseNumber(int num) {
		int rev=0, rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
}
