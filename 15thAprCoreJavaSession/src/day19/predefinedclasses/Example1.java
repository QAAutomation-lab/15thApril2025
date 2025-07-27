package day19.predefinedclasses;
class Sample{
	void calling() {
		System.out.println("Calling from Sample class");
	}
}
public class Example1 extends Sample{
	int num=25;
	public static void main(String[] args) {
		Example1 ref1=new Example1();
		ref1.calling();
		System.out.println(ref1.num);
		System.out.println("Example1 class reference, ref1: "+ref1);// java compiler will call toString() implicitly
			//or toString() ---> FQCN@Hexadecimalnumber
		System.out.println("Example1 class reference, ref1: "+ref1.toString());
		System.out.println("Example1 class ref1 address in integer: "+ref1.hashCode());
		
		Example1 ref2=new Example1();
		System.out.println("Example1 class reference, ref2: "+ref2.toString());
		System.out.println("Example1 class ref2 address in integer: "+ref2.hashCode());
		
		System.out.println("are object ref1 and ref2 same? "+ref1.equals(ref2));
		Example1 ref3=ref2;
		System.out.println("Example1 class reference, ref3: "+ref3.toString());
		System.out.println("Example1 class ref3 address in integer: "+ref3.hashCode());
		System.out.println("are object ref3 and ref2 same? "+ref3.equals(ref2));
	}
}
