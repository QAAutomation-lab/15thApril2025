package revision;

public class Example1 {

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		for(int i=1;i<=7;i++) {//number of lines
			for(int j=1;j<=i;j++) {//define design
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("Program Ends");
	}
}
/*
Debug: its use to execute a program line by line

Process:
	* add debug point in the line from where you want to start the execution line by line
	* run the program in debug mode, it will automatically stop the execution in the line where you have added break point
	* from there you can use shortcuts like
		F6: to go to next line
		F5: to go inside the Function/Method
		F8: to continue the program execution
		ctrl+shft+i : to get variable value or method return value
*/