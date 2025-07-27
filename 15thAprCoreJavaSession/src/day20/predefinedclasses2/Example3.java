package day20.predefinedclasses2;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int empID;
		double salary;
		String company;
		char grade;
		boolean status;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter emp id: ");
		empID=scn.nextInt();
		System.out.println("Enter salary: ");
		salary=scn.nextDouble();
		System.out.println("Enter company name: ");
		company=scn.next();
		System.out.println("Enter grade: ");
		grade=scn.next().charAt(0);
		System.out.println("Enter status: ");
		status=scn.nextBoolean();
		
		System.out.println(empID +"\n"+salary+"\n"+company+"\n"+grade+"\n"+status);
	}

}
