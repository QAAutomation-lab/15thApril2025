package day16.accessmodifier2;

import day16.accessmodifier1.Example1;

public class Sample1 extends Example1 {

	public static void main(String[] args) {
		Sample1 ref = new Sample1();
		// System.out.println("private variable num1 from Example1"+ref.num1);// compile time error as private members are not visible from outside the class
		// System.out.println("defalt variable num1 from Example1"+ref.num2);// compile time error as default members are not visible from outside the package
		System.out.println("protected variable num1 from Example1" + ref.num3);
		System.out.println("public variable num1 from Example1" + ref.num4);
	}

}
