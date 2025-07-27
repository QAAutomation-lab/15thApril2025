package day20.predefinedclasses2;

public class Sample4 {

	public static void main(String[] args) {
		//String object using literal
		String s1="CoreJavaBasics";
		System.out.println("s1: "+s1);
		System.out.println(s1.contains("Java"));
		System.out.println(s1.startsWith("Core"));
		System.out.println(s1.endsWith("cs"));
		
		String s2="Pune";
		String s3=s2+152;
		String s4=s2.concat("12");
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
		String s5=s2+null;//Punenull
		System.out.println("s5: "+s5);
		String s6=s2.concat(null);//RTE		
		System.out.println("s6: "+s6);
		
	}
}
/*
toString(): this method is overrided in String class, hence it will print object value instead of FullyQualifiedCLassname@hexa

equals(Object obj): this method is overrided in String class, hence it will compare two object based on value instead of address 

==: this operator is overrided in String class, hence it will compare two object based on address instead of value

*/