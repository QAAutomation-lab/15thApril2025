package day6.operators;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=5,num2=5;
		boolean cond1=(num1<=num2);
		boolean cond2=(num1>=num2);
		
		boolean res1=(cond1 && cond2);
		System.out.println("(num1<=num2) && (num1>=num2): "+res1);
		res1=(cond1 || cond2);
		System.out.println("(num1<=num2) && (num1>=num2): "+res1);
		
		System.out.println("(num1!=num2) && (num1>=num2): "+((num1!=num2) && (num1>=num2)));
		System.out.println("(num1!=num2) || (num1>=num2): "+((num1!=num2) || (num1>=num2)));
		System.out.println("Program Ends");
	}
}
/*
boolean cond1=true;
boolean cond2=false;
boolean res;
res= (cond1 && cond2);//f
res= (cond1 || cond2);//t
*/