package day7.dropdown;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> yr=new ArrayList<Integer>();
		String num="2022";
		int n1=Integer.parseInt(num);
		yr.add(n1);
		List<Integer> yr2=new ArrayList<Integer>(yr);
	}

}
/*
https://demo.automationtesting.in/Register.html
validate: year, month & date

* visible or not
* clickable or not
* multiselect allowed or not
* options count
* select option and validate new option is selected
* validate all option order	
* 		- year check ascending order
* 		- date check ascending order
* 		- month check sequence of months
*/