package day12.finalkeyword;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Started");
		final int age=25;// constant
		System.out.println("Age: "+age);
		//age=30;//CTE: you are trying to re-initialize final local variable
		System.out.println("1st Update, Age: "+age);
		//age=80;//CTE: you are trying to re-initialize final local variable
		System.out.println("2nd Update, Age: "+age);
		System.out.println("Program Ends");
	}
}
/*
final keyword:
	it is used to make variable/method/class as constant
	once you declared a variable as constant dn that variable value can;t be changed, if you will try to change dn you will
	get compile time error
		local variable:
			- you can declare variable as final, and before you use it make sure to initialize its value as local variable
			  can't have default value(for 2nd initialization you will get compile time error)
		global variable:
			- Once you declare a global variable with final keyword, dn these variable must be initialize at the time of 
			  declaration only otherwise you will get compile time error
			- SGV:
			    for these variable you have one exception that is you can initialize it later inside the static block
			- NSGV:
				for these variable you have two exception like
					- you can initialize them using constructor
					- you can initialize them using nonstatic block


*/