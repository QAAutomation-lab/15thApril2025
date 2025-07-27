package day17.encapsulationExamples;

public class PrimitiveCastingExample1 {

	public static void main(String[] args) {
		int num1=10;//Homo
		
		double num2=num1;//Hetro--> widening implicit
		double num3=(double)num1;//Hetro--> widening explicit
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Num3: "+num3);
		
		float f1=25.6f;
		double d1=f1;//Hetro--> widening implicit ---> compiler -->double d1=(double)f1;
		double d2=(double)f1;//Hetro--> widening explicit
		System.out.println("f1: "+f1);
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		System.out.println("************************************");
		double num=35.45;
		int n1=(int)num;//Narrowing- explicit --> data loss+size in terms of value .45
		float f2=(float)num;//Narrowing- explicit--> loss in size
		long l1=(long)num;//Narrowing- explicit--> data loss in terms of value .45
		
		System.out.println(n1);
		System.out.println(f2);
		System.out.println(l1);
	}
}
