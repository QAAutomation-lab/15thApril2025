package day20.predefinedclasses2;

public class Sample3 {

	public static void main(String[] args) {
		//String object using literal
		String s1="CoreJavaBasics";
		System.out.println("s1: "+s1);
		System.out.println("s1 in lower case: "+s1.toLowerCase());
		System.out.println("s1 in upper case: "+s1.toUpperCase());
		
		System.out.println(s1.replace('a', 'X'));
		System.out.println(s1.replace("Java", "NET"));
		
		String s2="   Bangalore to Pune   ";
		System.out.println("s2 with space: "+s2);
		System.out.println("Char count with space: "+s2.length());
		System.out.println("s2 without space: "+s2.trim());
		System.out.println("Char count without space: "+s2.trim().length());
		
		String s3="My name is khan";
		System.out.println("s3: "+s3);
		System.out.println("s3 substring from index 3: "+s3.substring(3));
		System.out.println("s3 substring from index 3 to 7: "+s3.substring(3,7));
	}
}
/*
toString(): this method is overrided in String class, hence it will print object value instead of FullyQualifiedCLassname@hexa

equals(Object obj): this method is overrided in String class, hence it will compare two object based on value instead of address 

==: this operator is overrided in String class, hence it will compare two object based on address instead of value

*/