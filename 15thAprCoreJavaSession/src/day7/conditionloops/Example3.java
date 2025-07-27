package day7.conditionloops;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program start");
		int age=18;
		char bldgrp='O';
		if(age>=18) {
			System.out.println("Welcome your age verification is done");
			if(bldgrp=='A') {
				System.out.println("Thank you, for donatiing your blood");
			}else {
				System.out.println("Sorry, but your blood group doesn;t match");
			}
		}else {
			System.out.println("Sorry, age verification is failed, your are not allowed to donate blood");
		}
		System.out.println("Program ends");
	}

}
