package day21.wrapperexample;

public class Sample5 {

	public static void main(String[] args) {
		//String object using literal
		String s1="CoreJavaBasics";
		System.out.println("s1: "+s1);
		
		StringBuffer s2=new StringBuffer("CoreJava");
		StringBuffer s3=new StringBuffer("CoreJavaBasics");
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		s2.append("Basics");
		System.out.println("updated s2: "+s2);
		System.out.println("String buffer capacity: "+s2.capacity());
		System.out.println("S2 reverse value: "+s2.reverse());
		s2=new StringBuffer("CoreJavaBasics");
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s2 and s3 comparision using equals: "+s2.equals(s3));
	
		System.out.println("s2 and s3 comparision using equals after converting them into String: "+s2.toString().equals(s3.toString()));
		
	}
}
/*
toString(): this method is overrided in String class, hence it will print object value instead of FullyQualifiedCLassname@hexa

equals(Object obj): default behavior

==: this operator is overrided in String class, hence it will compare two object based on address instead of value

*/