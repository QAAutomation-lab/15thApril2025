package day13.inheritanceexamples;
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class Inheritance5 extends A2,B2{
	
	Inheritance5(){
		super();//confusion 
	}

	public static void main(String args[]) {
		Inheritance5 obj = new Inheritance5();
	}
}

/**
is java supports multiple inheritance or not?
why java doesn't support multiple inheritance using classes?
*/