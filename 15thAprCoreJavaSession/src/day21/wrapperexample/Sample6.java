package day21.wrapperexample;

public class Sample6 {

	public static void main(String[] args) {
		//String object using literal
		String s1="CoreJavaBasics";
		System.out.println("s1: "+s1);
		
		StringBuilder s2=new StringBuilder("CoreJavaBasics");
		StringBuilder s3=new StringBuilder("CoreJavaBasics");
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