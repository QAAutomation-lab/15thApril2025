package day9.constructorexamples;

public class Example5 {

	Example5(){
		System.out.println("I am zero-param cons..");
	}
	Example5(int num){
		System.out.println("I am int-param cons..");
	}
	Example5(double n,int x){
		System.out.println("I am double-int-param cons..");
	}
	public static void main(String[] args) {
		Example5 ref1=new Example5(25);
		Example5 ref2=new Example5(75.66,25);
		Example5 ref3=new Example5();
	}

}
