package day7.conditionloops;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		int num=110;
		boolean c1=(num>=35) && (num<50);
		boolean c2=(num>50) && (num<70);
		boolean c3=(num>70) && (num<=100);
		char grade;
		if(c1) {
			grade='C';
		}else if(c2) {
			grade='B';
		}else if(c3){
			grade='A';
		}else {
			grade='X';
		}
		switch(grade) {
		case 'A':
			System.out.println("Pass with 1st division");
			break;
		case 'B':
			System.out.println("Pass with 2nd division");
			break;
		case 'C':
			System.out.println("Pass with 3rd division");
			break;
		default:
			System.out.println("Failed");
		}
	}

}
/*
50 ---> Pass with 3rd division
>50 & <70--> Pass with 2nd division
>70 --> Pass with 1st division


*/