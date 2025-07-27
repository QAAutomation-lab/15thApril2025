package day20.predefinedclasses2;

public class Sample1 {

	public static void main(String[] args) {
		//String object using literal
		String s1="Pune";
		String s2="Mumbai";
		String s3="Pune";
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s1 compared with s2 using equals method: "+s1.equals(s2));
		System.out.println("s1 compared with s3 using equals method: "+s1.equals(s3));		
		System.out.println("s1 compared with s2 using '==' operator: "+(s1==s2));
		System.out.println("s1 compared with s3 using '==' operator: "+(s1==s3));
		
		String s4=new String("Bangalore");//two object, 1st Heap, 2nd String constant pool
		System.out.println("s4: "+s4);
		String s5=new String("Bangalore");//one object in heap
		System.out.println("s5: "+s5);
		System.out.println("s4 compared with s5 using equals method: "+s4.equals(s5));//		
		System.out.println("s4 compared with s5 using '==' operator: "+(s4==s5));//
		
		String s6=new String("Mumbai");//one object in heap
		System.out.println("s6: "+s6);
		System.out.println("s2 compared with s6 using equals method: "+s2.equals(s6));//		
		System.out.println("s2 compared with s6 using '==' operator: "+(s2==s6));//
		
	}

}
/*
toString(): this method is overrided in String class, hence it will print object value instead of FullyQualifiedCLassname@hexa

equals(Object obj): this method is overrided in String class, hence it will compare two object based on value instead of address 

==: this operator is overrided in String class, hence it will compare two object based on address instead of value

*/