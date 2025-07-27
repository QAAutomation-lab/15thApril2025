package day20.predefinedclasses2;

public class Sample2 {

	public static void main(String[] args) {
		//String object using literal
		String s1="CoreJavaBasics";
		System.out.println("s1: "+s1);
		System.out.println("s1 char count: "+s1.length());
		System.out.println("char at index one in s1: "+s1.charAt(1));
		
		for(int i=0;i<s1.length();i++) {
			System.out.println("char at index "+i+" in s1: "+s1.charAt(i));
		}
		//reverse String
		String temp="";
		for(int i=s1.length()-1;i>=0;i--) {
			temp=temp+s1.charAt(i);
		}
		System.out.println("reverse string is : "+temp);
	}

}
/*
toString(): this method is overrided in String class, hence it will print object value instead of FullyQualifiedCLassname@hexa

equals(Object obj): this method is overrided in String class, hence it will compare two object based on value instead of address 

==: this operator is overrided in String class, hence it will compare two object based on address instead of value

*/