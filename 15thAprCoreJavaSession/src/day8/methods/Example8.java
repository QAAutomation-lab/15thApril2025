package day8.methods;

public class Example8 {

	public static void main(String[] args) {
		int amount=550000,t=5;
		double roi=7.5;
		double interest=calculateInterest(amount, roi,t);
		double finalAmount=amount+interest;
		System.out.println("Interest to be paid: "+interest );
		System.out.println("Total amount to be paid: "+finalAmount );
	}
	
	//write a method to calculate simple interest; i=(p*r*t)/100
	static double calculateInterest(int p,double r, int t) {
		double interest=(p*r*t)/100;
		System.out.println("p: "+p);
		System.out.println("r: "+r);
		System.out.println("t: "+t);
		return interest;
	}
	
	//write a method to check given number is palindrome or not
	
	//write a method to count number of digits in given number
}
/*
Method with void return type won't return any value to JVM
where method with other then void return type, will return value and that value will be stored in method itself
so in order get that value in console print that method or store that value into another variable of method return type


*/