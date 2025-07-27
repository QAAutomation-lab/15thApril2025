package day7.conditionloops;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("Program start");
		System.out.println("************Print character from a to z****************");
		for(char ch='a';ch<='z';ch++){
			System.out.println(ch);
		}
		System.out.println("************Print character from z to a****************");
		for(char ch='z';ch>='a';ch--){
			System.out.println(ch);
		}
		System.out.println("************Print character all vowels between a to s****************");
		for(char ch='a';ch<='s';ch++) {
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				System.out.println(ch);
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