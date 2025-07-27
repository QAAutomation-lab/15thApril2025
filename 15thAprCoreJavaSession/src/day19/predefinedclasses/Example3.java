package day19.predefinedclasses;
class Demo{
	void calling(int num) {
		System.out.println("Calling from Demo class: "+num);
	}
}
public class Example3 {
	static void display() {
		System.out.println("I am display from Example3");
	}
	static Demo ref=new Demo();//ref is a static reference variable of Demo class
	public static void main(String[] args) {
		Example3.display();
		Demo d1=new Demo();
		d1.calling(123);
//Classname.staticRefVariableOfDemoClass.nonstaticMethodOfDemo		
		Example3.ref.calling(456);
//Classname.staticRefVariableOfPrintStreamClass.nonstaticMethodOfPrintStreamClass		
		System.out.println("Demo class reference d1: "+d1);
		System.out.println("Demo class reference ref: "+Example3.ref);
		System.err.println("I am coming from err");
	}
}
