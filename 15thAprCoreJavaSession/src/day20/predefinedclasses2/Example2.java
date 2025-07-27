package day20.predefinedclasses2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int num1,num2,res;
		//create an instance of scanner class
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1=scn.nextInt();
		System.out.println("Enter number2: ");
		num2=scn.nextInt();
		res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number1: "+num2);
		System.out.println("Sum result: "+res);
	}

}
/*
if you want fresh data for each execution, dn use Scanner class
Scanner:
	is a predefined class in java belongs to java.util package
	this package needs to be imported while using Scanner class
	this class has several method to read diff type of data from keyword at the time execution
	like:
	


*/