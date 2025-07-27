package day16.accessmodifier1;

public class Example1 {
	private int num1=10;
	int num2=20;
	protected int num3=30;
	public int num4=40;	
	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println("private variable num1 from Example1"+ref.num1);
		System.out.println("defalt variable num1 from Example1"+ref.num2);
		System.out.println("protected variable num1 from Example1"+ref.num3);
		System.out.println("public variable num1 from Example1"+ref.num4);
	}

}
/*
private: can be access within a class only

default: can be access within a package

protected: can be access within a package but can be access from outside the package using inheritance

public: can be access from anywhere but those member class should be declared as public

*/