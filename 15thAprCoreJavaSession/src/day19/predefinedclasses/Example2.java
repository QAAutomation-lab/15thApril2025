package day19.predefinedclasses;
class Sample2{
	void calling() {
		System.out.println("Calling from Sample class");
	}
}
public class Example2 extends Sample2{
	int num=25;
	public static void main(String[] args) {
		
		Sample2 s1=new Sample2();
		System.out.println("Sample2 class reference, s1: "+s1);
		System.out.println("Sample2 class s1 address in integer: "+s1.hashCode());
		Sample2 s2=new Sample2();
		System.out.println("Sample2 class reference, s2: "+s2);
		System.out.println("Sample2 class s2 address in integer: "+s2.hashCode());
		System.out.println("are object s1 and s2 same? "+s1.equals(s2));
		
		Example2 ref1=new Example2();
		System.out.println("Example1 class reference, ref1: "+ref1);// java compiler will call toString() implicitly
			//or toString() ---> FQCN@Hexadecimalnumber
		System.out.println("Example1 class reference, ref1: "+ref1.toString());
		System.out.println("Example1 class ref1 address in integer: "+ref1.hashCode());
		
		Example2 ref2=new Example2();
		System.out.println("Example1 class reference, ref2: "+ref2.toString());
		System.out.println("Example1 class ref2 address in integer: "+ref2.hashCode());
		
		System.out.println("are object ref1 and ref2 same? "+ref1.equals(ref2));
		Example2 ref3=ref2;
		System.out.println("Example1 class reference, ref3: "+ref3.toString());
		System.out.println("Example1 class ref3 address in integer: "+ref3.hashCode());
		System.out.println("are object ref3 and ref2 same? "+ref3.equals(ref2));
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	@Override
	public int hashCode() {
		return 404;
	}
	@Override
	public String toString() {
		return "Hello";
	}
}
