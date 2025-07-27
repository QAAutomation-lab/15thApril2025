package day7.conditionloops;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program start");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Welcome to automation session.");
		}
		System.out.println("***********Print number from 1 to 10*******************");
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		System.out.println("***********Print number from 10 to 1*******************");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("***********Print even numbers between 1 to 21*******************");
		for(int i=1;i<=21;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("***********Print odd numbers between 1 to 21*******************");
		for(int i=1;i<=21;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("Program ends");
	}
}
/*
when you have to repeat the execution of certain lines then use loops

for(initialization;condition;incr/decr)
{  
	//statement or code to be executed  
}  

* Initialization:	int i=1
		   step1: condition
		   step2: execute body
		   step3: incre/decre				
		   repeat step1 to 3 till the condition gets failed


*/