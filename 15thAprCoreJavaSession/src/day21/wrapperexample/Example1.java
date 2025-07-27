package day21.wrapperexample;

public class Example1 {

	public static void main(String[] args) {
		int x=25;
		//Boxing
		Integer obj1=x;//Integer obj1=25;
		System.out.println("x: "+x);
		System.out.println("obj1: "+obj1);
		System.out.println("x and obj1 comparision using '==' "+(x==obj1));
		
		double d=256.36;
		//Boxing
		Double obj2=d;
		System.out.println("d: "+d);
		System.out.println("obj2: "+obj2);
		
		char ch='A';
		//Boxing
		Character c1=ch;
		System.out.println("ch: "+ch);
		System.out.println("c1: "+c1);
		
		//Unboxing
		int y=obj1.intValue();
		double d1=obj2.doubleValue();
		char ch1=c1.charValue();
		System.out.println(y);
		System.out.println(d1);
		System.out.println(ch1);

	}

}
