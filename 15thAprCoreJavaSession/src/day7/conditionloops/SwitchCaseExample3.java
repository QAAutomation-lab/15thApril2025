package day7.conditionloops;

public class SwitchCaseExample3 {

	public static void main(String[] args) {
		char ops='+';
		int num1=10,num2=5, result;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		switch(ops) {
		case '+':
			result=num1+num2;
			System.out.println("Addition of two numbers: "+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("Subs of two numbers: "+result);
			break;
		case '/':
			result=num1/num2;
			System.out.println("Div of two numbers: "+result);
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

}
