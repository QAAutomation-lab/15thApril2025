package day21.wrapperexample;

public class SingletonClassExample {

	private SingletonClassExample() {
		System.out.println("I am SingletonClassExample private cons");
	}
	
	private static SingletonClassExample ref=new SingletonClassExample();
	
	public static SingletonClassExample getInstance() {
		return ref;
	}
	
	int num=101;
	String name="Pune";
}

class Testing{
	public static void main(String[] args) {
		//as SingletonClassExample constructor is defined as private hence object can't be create from outside the class
		//SingletonClassExample s1=new SingletonClassExample();//CTE
		
		SingletonClassExample s1=SingletonClassExample.getInstance();
		System.out.println("num using s1: "+s1.num);
		System.out.println("name using s1: "+s1.name);
		s1.num=505;
		s1.name="Mumbai";
		System.out.println("updated, num using s1: "+s1.num);
		System.out.println("updated, name using s1: "+s1.name);
		
		SingletonClassExample s2=SingletonClassExample.getInstance();
		System.out.println("num using s2: "+s2.num);
		System.out.println("name using s2: "+s2.name);
	}
}