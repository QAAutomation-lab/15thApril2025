package day8.methods;

public class Example7 {

	public static void main(String[] args) {
		int num=36;
		System.out.println("Given number is : "+num);
		System.out.println("is given number prime? "+checkPrimeNumber(num));
	}

	// write a method to check given number is prime or not
	static boolean checkPrimeNumber(int num) {
		int counter=0;
		boolean res;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				counter++;
			}
		}
		
		if(counter==2) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}
}
/*
Method with void return type won't return any value to JVM
where method with other then void return type, will return value and that value will be stored in method itself
so in order get that value in console print that method or store that value into another variable of method return type


*/