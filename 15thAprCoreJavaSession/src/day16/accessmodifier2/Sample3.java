package day16.accessmodifier2;

public class Sample3 {

	public static void main(String[] args) {
		day16.accessmodifier1.Example1 ref = new day16.accessmodifier1.Example1();
		// System.out.println("private variable num1 from Example1"+ref.num1);// compile time error as private members are not visible from outside the class
		// System.out.println("defalt variable num1 from Example1"+ref.num2);// compile time error as default members are not visible from outside the package
		//System.out.println("protected variable num1 from Example1" + ref.num3);//compile time error as protected members can't be access directly from outside the package use inheritance
		System.out.println("public variable num1 from Example1" + ref.num4);
	}
}
class Sample4{
	public static void main(String[] args) {
		day16.accessmodifier1.Example1 ref = new day16.accessmodifier1.Example1();
		System.out.println("public variable num1 from Example1" + ref.num4);
	}
}
