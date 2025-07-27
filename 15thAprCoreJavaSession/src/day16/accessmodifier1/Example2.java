package day16.accessmodifier1;

public class Example2 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		//System.out.println("private variable num1 from Example1"+ref.num1);// compile time error as private members are not visible from outside the class
		System.out.println("defalt variable num1 from Example1"+ref.num2);
		System.out.println("protected variable num1 from Example1"+ref.num3);
		System.out.println("public variable num1 from Example1"+ref.num4);
	}

}
