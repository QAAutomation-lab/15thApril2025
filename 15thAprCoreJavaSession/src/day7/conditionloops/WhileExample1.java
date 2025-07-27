package day7.conditionloops;

public class WhileExample1 {

	public static void main(String[] args) {
		 int num=5;
		 while(num!=0) {
			 System.out.println("Welcome to automation session");
			 num--;
		 }
		 System.out.println("*********Print number between 10 to 15***********");
		 num=10;
		 while(num<=15) {
			 System.out.println(num);
			 num++;
		 }
		 System.out.println("*********Print character between A to F***********");
		 char ch='A';
		 while(ch<='F') {
			 System.out.println(ch);
			 ch++;
		 }
	}

}
